
#!/bin/bash
set -e

echo "Running post-deployment script..."

cd /home/ec2-user/deploy

java HelloJava

echo "Java application executed successfully."
