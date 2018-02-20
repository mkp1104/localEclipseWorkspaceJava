
var Store = function() {

}

Store.prototype.getViaAjax = function(url, callback) {
    switch(url) {
        case "/users/search?id=100":
            callback({
                id: 100,
                name: "Jeswin",
                age: 200,
                status: "Training"
            });
            break;
        case "/friends/search?id=100":
            callback([
                {
                    id: 1,
                    name: "Modi",
                    age: 200,
                    status: "Training"
                },
                {
                    id: 2,
                    name: "Rahul",
                    age: 200,
                    status: "Training"
                },           
                {
                    id: 3,
                    name: "Kejriwal",
                    age: 200,
                    status: "Training"
                }
            ]);
            break;
        case "/posts/search?user=100":
            callback([
                { 
                    user: 1,
                    content: "Campaigning",
                    time: "today",
                    comments: ["Excellent", "You won"]
                },
                { 
                    user: 2,
                    content: "xlsdkjfdf",
                    time: "today",
                    comments: ["Excellent", "You won"]
                },
                { 
                    user: 3,
                    content: "abcded",
                    time: "today",
                    comments: ["Excellent", "You won"]
                }
            ]);
            break;
    }
}


var UserStore = function() {     
}

UserStore.prototype = Object.create(Store.prototype);
UserStore.prototype.constructor = UserStore;

UserStore.prototype.getUserById = function(id, callback) {
    this.getViaAjax("/users/search?id=" + id, callback);

//    this.getViaAjax("/users/search?id=" + id, function(data) {
//        callback(new User(data.id, data.name, data.age, data.status));
//    });
}

UserStore.prototype.getFriends = function(id, callback) {
    this.getViaAjax("/friends/search?id=" + id, function(data) {
        callback(data.map(function(item) {
            return new User(item.id, item.name, item.age, item.status);
        }));
    }); 
}



var PostStore = function() {
}

PostStore.prototype = Object.create(Store.prototype);
PostStore.prototype.constructor = PostStore;

PostStore.prototype.getPosts = function(userid, callback) {
    this.getViaAjax("/posts/search?user=" + userid, function(data) {
        callback(data.map(function(i) {
            return new Post(i.user, i.content, i.time, i.comments);
        }));
    });
}


 
