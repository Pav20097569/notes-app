
rootProject.name = "notes-app"
include("src:test")
findProject(":src:test")?.name = "test"
