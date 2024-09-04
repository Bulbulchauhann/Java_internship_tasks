function getUserAccess(role, resource) {
    switch (role) {
        case "admin":
            return "Full access granted";
        case "editor":
            switch (resource) {
                case "article":
                    return "Limited Access granted only to edit articles";
                case "video":
                    return "Limited Access granted only to edit videos";
                default:
                    return "Limited Access only";
            }
        case "viewer":
            return "View access granted";
        default:
            return "No access granted";              
    }
}

console.log(getUserAccess("admin", "article"));
console.log(getUserAccess("editor", "article"));
console.log(getUserAccess("editor", "video"));
console.log(getUserAccess("editor", "podcast"));
console.log(getUserAccess("viewer", "article"));
console.log(getUserAccess("viewer", "video"));
console.log(getUserAccess("viewer", "book"));