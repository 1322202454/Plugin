package com.github.1322202454.messy.services

import com.intellij.openapi.project.Project
import com.github.1322202454.messy.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
