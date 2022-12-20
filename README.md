Topic
--------------------------------------------------------------
AWS Introduction
IAM Concepts
EC2 Concepts
AWS S3
RDS / PostGres / DynamoDB 
Other Services ( SQS, SNS, Elastic Beanstalk, Lambda ) 
AWS Containers ( ECS, Fargate / Kubernetes , etc. )
Monitoring ( Cloud Watch Logs, Cloud Trials, CloudWatch Vs CloudTrail )
Cloud Formation Template

AWS 
    1. Amazon Web Services is a cloud service.
    2. Cloud Computing (AWS S3 service back in 2006 early)
        PaaS        (Platform = OS+RE) - EC2
        IaaS        S3,GoogleDrive ..etc
        SaaS        RDS / PostGres / DynamoDB , Other Services ( SQS, SNS, Elastic Beanstalk, Lambda ) 

    Challenges
        a. Reliability and Control          Hybrid Cloud Deploymnet
        b. Learning Curve
        c. Migration

IAM     Identity and Access Management      (Authentication and Authroization of our AWS account)
EC2     Elastic Cloud Compute               (Virtual Server)
S3      Simple Storage Service              General Purpose Storage (Software or data)
ECS     Elastic Container Service           Containerization
RDS     Relational Database Service         MySQL,...etc
SQS     Simple Queue Service                Messaging Service (similar JMS/RabbitMQ..etc)
SNS     Simple Notification Service         Messaging Service (similar JMS/RabbitMQ..etc)
EBS     Elastic Block Service               Storage for hosted instances
        Elastic Beanstalk

AWS Step Functions is a orchestration service:

    lamdbaFun   --------> lambdaFun2    ----------> lamdbaFun 

                        |----------> LamdbaFunCase2
    lamdbaFun   ------->|
                        |----------> LambdaFunCase1

    ----------> LmabdaFun1 ------->
    ----------> LmabdaFun2 -------> 
    ----------> LmabdaFun3 ------->
    ----------> LmabdaFun4 ------->

    AWS step Functions are employed to automate a wrokflow.

CloudWatch vs CloudTrail
--------------------------------------------------------------

    https://www.opsramp.com/guides/aws-monitoring-tool/cloudtrail-vs-cloudwatch/#:~:text=CloudWatch%20is%20a%20monitoring%20service,activity%20in%20your%20AWS%20account.&text=CloudWatch%20monitors%20applications%20and%20infrastructure,actions%20in%20the%20AWS%20environment.

Microservices Case Study 
---------------------------------------------------------------

    HRManagement Case Study:

        1. Employee Registration Service            <---EmployeeDetails---->    RDS - MySQL
        2. Employee Profile Pic Management Service  <---Picture------------>    S3 Bucket

