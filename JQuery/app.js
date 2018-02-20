var App = function() {
}

App.prototype.loadUser = function(userid) {
    var userStore = new UserStore();
    userStore.getUserById(userid, this.onUserLoad);
    userStore.getFriends(userid, this.onFriendsLoad);
    
    var postStore = new PostStore();
    postStore.getPosts(userid, this.onPostsLoad);
    
    setInterval(function() {
       this.updatePosts() 
    }, 60000); 
}

App.prototype.onUserLoad = function(user) {
    $('#user-name').html(user.name);
    $('#user-details').html("age: " + user.age + ", status:" + user.status);
}

App.prototype.onFriendsLoad = function(posts) {
postStore.getPosts(userid);
}


App.prototype.onPostsLoad = function(posts) {
}


App.prototype.updatePosts = function() {
    var postStore = new PostStore();
    var posts = postStore.getPosts(userid);
    //Update the UI with new posts    
}
