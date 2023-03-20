val=$(docker ps -aq)

if [ "$val" != "" ]
then
        docker ps -aq | xargs docker stop | xargs docker rm
        docker rmi $(docker images -q)
fi