pipeline 
{
    agent any

    stages 
    {
        stage('Build') 
        {
            steps 
            {
                sh 'docker build -t web-app:latest .'
                
            }
        }
        stage('deploy') 
        {
            steps
            {
                sh 'docker run -d --name my-webapp --rm -p 5000:5000 web-app:latest'
            }
        }
        
    }
}