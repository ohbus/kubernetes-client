/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.java.generator.gradle.plugin;

import io.fabric8.java.generator.gradle.plugin.task.JavaGeneratorCrd2JavaTask;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JavaGeneratorPlugin implements Plugin<Project> {
  @Override
  public void apply(Project project) {
    // create an extension for the plugin
    project.getExtensions().create(JavaGeneratorPluginExtension.NAME, JavaGeneratorPluginExtension.class, project);
    // register tasks
    project.getTasks().register(JavaGeneratorCrd2JavaTask.NAME, JavaGeneratorCrd2JavaTask.class,
        JavaGeneratorPluginExtension.class);
  }
}
