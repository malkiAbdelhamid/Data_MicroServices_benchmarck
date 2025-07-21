# Join_MicroServices_benchmarck

This repository provides a complete benchmark microservice environment for evaluating data composition strategies in microservice-based architectures, as presented in the paper:

> **Title**: Data Microservice Composition Optimization Using Deep Reinforcement Learning  
> **Authors**: Abdelhamid Malki, Mimoun Malki, Sidi-Mohamed Benslimane  

## Overview

This benchmark reproduces the experimental setup used in the paper to evaluate Deep Q-Learning-based microservice composition (`DQL-Comp`). It includes:

- 21 microservices built over the IMDB dataset
- A set of 21 PostgreSQL databases (1 per microservice)
- K8s deployment configurations
- Dataset and initial loading scripts

## Prerequisites

- A working **Kubernetes cluster** (multi-node)
- `kubectl` configured to access the cluster
- Each node must have a local path: `/home/ubuntu/IMDB_DataSet_Per_Table`
- Docker/CRI-O installed on each node

---

## 💾 Step-by-Step Setup Instructions

### Step 1: Download the CSV Dataset

Each microservice has its own dataset. To download them using the driver link in the file `datasetlink.txt`:

```bash
gdown https://drive.google.com/file/d/1H-dktt8eqof8Cj6HBuh7gRBWIK0Hfo8T/view
```

This downloads a compressed archive containing per-table CSVs for each microservice.

### Step 2: Unzip and Distribute the Datasets

Then, copy the downloaded dataset to all worker nodes of your K8s cluster under the path:

```bash
/home/ubuntu/
```
> You can use `scp`, `rsync`, or any preferred method to replicate this directory on each node.


Unzip the downloaded dataset archive:

```bash
unzip IMDB_CSV_DataSet_Per_Table.zip
```




### Step 3: Deploy PostgreSQL Database Pods

Each microservice will have a dedicated PostgreSQL database pod. To deploy all database pods:

```bash
kubectl apply -f k8s_DataBase_Deployment_Service.yml
```

Ensure persistent volumes use the mounted hostPath `/home/ubuntu/IMDB_DataSet_Per_Table` for each database.

### Step 4: Deploy the 21 Microservices

To deploy them all:

```bash
kubectl apply -f k8s_Microservices_Deployment_Service.yml
```

Each microservice exposes a REST API endpoint to perform filtering and join operations based on its associated dataset.

> The services follow the API Composition model and can be invoked individually or as part of a composition plan.

---


## 📜 License

This benchmark is provided for academic and research use.
