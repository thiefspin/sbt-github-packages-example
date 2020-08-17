# SBT Github Packages
Github packages has support for Maven but not yet SBT at the time of writing. Luckily there are community plugins available. 

The below is example of how to get it working quickly with a SBT project. (Note there are far more extensive examples out there and this is just a quick example of how to get it working quickly in a very specific way)
If you want more information I based my example of off https://medium.com/@supermanue/how-to-publish-a-scala-library-in-github-bfb0fa39c1e4. 

* First create a github token by going to `Settings -> Developer Settings -> Personal access tokens` on https://github.com. 
* Make sure the token has access to github packages
* Now add the token to your git config.
    * If you are on linux or macos you should have a file in `$HOME/.gitconfig` which should look like this after adding your token:
    ```
  [user]
  	name = Your Name
  	email = youremail@gmail.com
  
  [github]
  	token = your_token
  ```
* Add this plugin to your project in `project/plugins.sbt`
```
addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.2")
```
* Add this to your `build.sbt`
```
githubOwner := "your_org",
githubRepository := "sbt-github-packages-example",
githubTokenSource := TokenSource.GitConfig("github.token")
```

You can now publish to Github packages by running `sbt publish`

## TODO
Provide example of how to get it running in Github Actions