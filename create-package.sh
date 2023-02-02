./mvnw clean install
docker rmi -f mhbappy18/app_version_application &>/dev/null && echo 'Removed old container'
docker build -t mhbappy18/app_version_application .
docker push mhbappy18/app_version_application
