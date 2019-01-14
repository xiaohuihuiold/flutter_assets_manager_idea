package com.xhhold.idea.fam.factory

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.Content
import com.intellij.ui.content.ContentFactory
import com.xhhold.idea.fam.ui.FamWindow

class FamWindowFactory : ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val famWindow: FamWindow = FamWindow(toolWindow)
        val contentFactory: ContentFactory = ContentFactory.SERVICE.getInstance()
        val content: Content = contentFactory.createContent(famWindow.content, "", false)
        toolWindow.contentManager.addContent(content)

    }
}