# Workshop 11 Instructions

### Maven commands
1. mvnw
2. mvnw compile
3. mvnw package
4. mvnw clean package
5. mvnw clean (cleans away all compiled class in the target folder)
6. mvnw clean package spring-boot:run
7. mvnw spring-boot:run

### Git commands
git init
git remote add origin https://github.com/<username>/<projectname.git>
git add *
git status
git commit -m "commit message details"
git push -u origin master
git pull
gir branch -a (to see all the branches locally and remotely)
git branch -delete <branch name>
git checkout -b develop master (check out from the master branch to the develop branch)
 -- to push: git push origin develop
git checkout master (to change back to master)
git branch
git merge develop


To sync the code to developbranch
git checkout develop
git merge master
git push -u origin develop

git checkout master
git merge develop (merge changes done in develop to master branch)
git push -u origin master

// make changes in master, and need to synchronise these changes to develop branch
// assume changes have already been checked into master branch
git checkout develop
git merge master (merge changes done in master branch into develop branch)
git push -u origin develop
