![image](https://github.com/seojeongmin7809/food-delivery-2/assets/132860972/2ddf045a-d3e5-4a8b-a5a3-134c25bdb0dd)


![image](https://github.com/seojeongmin7809/food-delivery-2/assets/132860972/18959e19-2572-4e82-9065-b8a5ab47130e)


![image](https://github.com/seojeongmin7809/food-delivery-2/assets/132860972/a21b4926-763f-4e14-a6e4-587b9a17652a)


![image](https://github.com/seojeongmin7809/food-delivery-2/assets/132860972/a68e98a1-8b70-4526-894d-c31c94840160)

![image](https://github.com/seojeongmin7809/food-delivery-2/assets/132860972/71d6daf6-36f7-4076-a01b-b499c16aefa0)


![image](https://github.com/seojeongmin7809/food-delivery-2/assets/132860972/47ac01b9-b338-4e75-b27d-a5f11cec0018)


![image](https://github.com/seojeongmin7809/food-delivery-2/assets/132860972/d502f3ac-e799-425d-83db-1d036c424196)


![image](https://github.com/seojeongmin7809/food-delivery-2/assets/132860972/700db9a5-180e-435d-b047-63ab271e0fb2)




# 

## Model
www.msaez.io/#/storming/fooddelivery-home

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- front
- store
- rider
- customer


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- front
```
 http :8088/orders id="id" foodId="foodId" options="options" address="address" customerId="customerId" storeId="storeId" 
 http :8088/payments id="id" orderId="orderId" status="status" 
```
- store
```
 http :8088/foodCookings id="id" foodId="foodId" orderId="orderId" options="options" status="status" storeId="storeId" customerId="customerId" 
```
- rider
```
 http :8088/deliveries id="id" orderId="orderId" ststus="ststus" address="address" 
```
- customer
```
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

