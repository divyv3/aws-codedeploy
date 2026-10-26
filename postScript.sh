#!/bin/bash
#set -e

echo "Running after deployment..."

cd /home/ec2-user/deploy

java HelloJava

echo "Java application executed successfully."
