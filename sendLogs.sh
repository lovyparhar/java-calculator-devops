# Get the logs out from the container
docker cp calculator:/logs .
scp ~/logs/* jenkins@mac:~/logs/


