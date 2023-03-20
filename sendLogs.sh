# Get the logs out from the container
docker cp calculator:/logs .

# Send the logs to the controller
scp ~/logs/* jenkins@mac:~/logs/


