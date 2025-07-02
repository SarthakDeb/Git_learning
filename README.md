# Git_learning

# Git Commands Reference Guide

## Repository Setup & Configuration

### Initial Setup (First Time)
```bash
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
```
**When to use:** Before your first commit ever. Sets your identity for all repositories.

### Starting a New Project
```bash
git init
```
**When to use:** Creating a new repository in an existing folder.

```bash
git clone https://github.com/username/repository.git
```
**When to use:** Downloading an existing repository from GitHub, GitLab, etc.

## Daily Workflow Commands

### Checking Status
```bash
git status
```
**When to use:** See which files are modified, staged, or untracked. Use this constantly!

```bash
git log
git log --oneline
git log --graph --oneline --all
```
**When to use:** View commit history. `--oneline` for compact view, `--graph` for visual branch structure.

### Making Changes

```bash
git add filename.txt
git add .
git add -A
```
**When to use:** Stage files for commit. Use `.` for all files in current directory, `-A` for all files in repository.

```bash
git commit -m "Your commit message"
git commit -am "Message"
```
**When to use:** Save staged changes with a message. `-am` adds and commits modified files in one step.

```bash
git diff
git diff --staged
git diff HEAD~1
```
**When to use:** See changes before staging (`git diff`), after staging (`--staged`), or compare with previous commits.

## Undoing Changes

### Before Committing
```bash
git restore filename.txt
git restore .
```
**When to use:** Discard changes in working directory (newer Git versions).

```bash
git checkout -- filename.txt
```
**When to use:** Discard changes in working directory (older Git versions).

```bash
git reset filename.txt
git reset
```
**When to use:** Unstage files that were added with `git add`.

### After Committing
```bash
git commit --amend -m "New message"
```
**When to use:** Fix the last commit message or add forgotten files to the last commit.

```bash
git reset --soft HEAD~1
git reset --mixed HEAD~1
git reset --hard HEAD~1
```
**When to use:** Undo commits. `--soft` keeps changes staged, `--mixed` keeps changes unstaged, `--hard` deletes changes completely.

```bash
git revert commit-hash
```
**When to use:** Safely undo a commit by creating a new commit that reverses the changes.

## Branch Management

### Working with Branches
```bash
git branch
git branch -a
```
**When to use:** List local branches (`git branch`) or all branches including remote (`-a`).

```bash
git branch feature-name
git checkout -b feature-name
git switch -c feature-name
```
**When to use:** Create new branch. `checkout -b` or `switch -c` creates and switches in one command.

```bash
git checkout branch-name
git switch branch-name
```
**When to use:** Switch to an existing branch.

```bash
git branch -d branch-name
git branch -D branch-name
```
**When to use:** Delete a branch. `-d` is safe (checks if merged), `-D` forces deletion.

### Merging
```bash
git merge feature-branch
```
**When to use:** Merge another branch into your current branch.

```bash
git merge --no-ff feature-branch
```
**When to use:** Force a merge commit even for fast-forward merges (preserves branch history).

## Remote Repository Operations

### Remote Management
```bash
git remote add origin https://github.com/username/repo.git
git remote -v
```
**When to use:** Connect your local repo to a remote repository and view remote connections.

### Synchronizing
```bash
git fetch
git fetch origin
```
**When to use:** Download changes from remote without merging them into your current branch.

```bash
git pull
git pull origin main
```
**When to use:** Download and merge changes from remote. Equivalent to `git fetch` + `git merge`.

```bash
git push
git push origin branch-name
git push -u origin branch-name
```
**When to use:** Upload your commits to remote. `-u` sets upstream tracking for the branch.

```bash
git push --force-with-lease
```
**When to use:** Force push safely (after rebasing). Better than `--force` as it checks for other changes.

## Advanced Operations

### Stashing (Temporary Storage)
```bash
git stash
git stash push -m "Work in progress"
```
**When to use:** Temporarily save changes when you need to switch branches quickly.

```bash
git stash list
git stash pop
git stash apply
```
**When to use:** View stashed changes (`list`), apply and remove latest stash (`pop`), or apply without removing (`apply`).

### Rebasing
```bash
git rebase main
git rebase --interactive HEAD~3
```
**When to use:** Replay commits on top of another branch for cleaner history. Interactive mode for editing commit history.

```bash
git rebase --continue
git rebase --abort
```
**When to use:** Continue after resolving conflicts during rebase, or cancel the rebase entirely.

### Cherry Picking
```bash
git cherry-pick commit-hash
```
**When to use:** Apply a specific commit from another branch to your current branch.

## File Operations

### Tracking and Removing
```bash
git rm filename.txt
git rm --cached filename.txt
```
**When to use:** Remove file from repository. `--cached` removes from Git but keeps local file.

```bash
git mv oldname.txt newname.txt
```
**When to use:** Rename or move files while keeping Git history.

### Ignoring Files
```bash
echo "node_modules/" >> .gitignore
```
**When to use:** Add files/folders to `.gitignore` to prevent Git from tracking them.

## Troubleshooting Commands

### Information Gathering
```bash
git show commit-hash
git show HEAD
```
**When to use:** View details of a specific commit.

```bash
git blame filename.txt
```
**When to use:** See who last modified each line of a file.

```bash
git reflog
```
**When to use:** View all recent actions (useful for recovering "lost" commits).

### Conflict Resolution
```bash
git status
git diff
git add conflicted-file.txt
git commit
```
**When to use:** During merge conflicts - check status, resolve conflicts in files, add resolved files, commit.

## Quick Reference Workflows

### Starting a New Feature
```bash
git checkout main
git pull origin main
git checkout -b feature/new-feature
# Make changes
git add .
git commit -m "Add new feature"
git push -u origin feature/new-feature
```

### Daily Update Routine
```bash
git status
git add .
git commit -m "Daily progress on feature"
git pull origin main  # Check for updates
git push
```

### Fixing a Mistake
```bash
git log --oneline  # Find the problem
git reset --soft HEAD~1  # Undo last commit but keep changes
# Fix the issues
git add .
git commit -m "Fixed version"
```

## Pro Tips

- Use `git status` frequently - it's your best friend
- Write clear, descriptive commit messages
- Commit small, logical changes rather than large dumps
- Always pull before pushing to avoid conflicts
- Use branches for features, even small ones
- When in doubt, `git stash` before switching branches
