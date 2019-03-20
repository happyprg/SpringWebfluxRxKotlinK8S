# Hosts
# Recipe
* https://github.com/json-path/JsonPath
* https://github.com/kittinunf/fuel/blob/master/fuel/README.md
* Mustache
# Dockerizing
* `docker build . -t {DockerHub}`
* `docker push  {DockerHub}`
* `docker run -p 80:8080 {DockerHub}`
# Deploy using K8s command
* `kubectl run {K8S-deploy-name}-release --image={DockerHub} --port=8080 --expose`
* `kubectl set image deployments/{K8S-deploy-name}-alpha {DockerHub}`
* `kubectl set image deployments/{K8S-deploy-name}-beta {DockerHub}`
* `kubectl set image deployments/{K8S-deploy-name}-release {DockerHub}`
# Adjust scale
* `kubectl scale deployments/{K8S-deploy-name}-alpha --replicas=2`
* `kubectl scale deployments/{K8S-deploy-name}-beta --replicas=2`
* `kubectl scale deployments/{K8S-deploy-name}-release --replicas=2`
# Add Configmap for phase #1
* `kubectl create configmap spring-boot-alpha --from-literal=SPRING_PROFILES_ACTIVE=alpha`
* `kubectl create configmap spring-boot-beta --from-literal=SPRING_PROFILES_ACTIVE=beta`
* `kubectl create configmap spring-boot-release --from-literal=SPRING_PROFILES_ACTIVE=release`
# Add Configmap for phase #2
* `kubectl create configmap spring-boot-alpha-java-opt --from-literal=JAVA_OPTIONS=-Dspring.profiles.active=alpha`
* `kubectl create configmap spring-boot-beta-java-opt --from-literal=JAVA_OPTIONS=-Dspring.profiles.active=beta`
# How to add a Configmap to pod
* [https://kubernetes.io/docs/tasks/configure-pod-container/configure-pod-configmap/](https://kubernetes.io/docs/tasks/configure-pod-container/configure-pod-configmap/)
# Build & Deploy
* ./deploy.sh {tag_name}
* e.g) ./deploy.sh 20190312_5
# Docker run
* docker run -d -p 28080:8080 -e "SPRING_PROFILES_ACTIVE=release" --name {instanceName} {DockerHub}
* docker exec -ti {DockerHub} /bin/sh
# Referer
* [install docker to Centos](https://docs.docker.com/install/linux/docker-ce/centos/)
