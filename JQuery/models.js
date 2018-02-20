var User = function(id, name, age, status) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.status = status;
}

var Post = function(user, content, time, comments) {
    this.user = user;
    this.content = content;
    this.time = time;
    this.comments = comments;
} 

