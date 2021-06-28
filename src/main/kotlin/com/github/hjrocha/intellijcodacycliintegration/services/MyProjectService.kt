package com.github.hjrocha.intellijcodacycliintegration.services

import com.github.hjrocha.intellijcodacycliintegration.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
