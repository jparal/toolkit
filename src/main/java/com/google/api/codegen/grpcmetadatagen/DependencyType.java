/* Copyright 2017 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.api.codegen.grpcmetadatagen;

/**
 * Indicates the type of dependency.
 *
 * <p>Currently we support two types of the dependency:
 *
 * <ol>
 *   <li> (1) Local dependency: The dependency that is stored in a local build system
 *   <li> (2) Release dependency: The dependency that is released to a remote packaging system such
 *       as Maven Central
 * </ol>
 */
public enum DependencyType {
  /** Local dependency */
  LOCAL,

  /** Release dependency e.g. Maven central */
  RELEASE;

  public static DependencyType of(String dependencyTypeString) {
    if (dependencyTypeString != null) {
      return DependencyType.valueOf(dependencyTypeString.toUpperCase());
    } else {
      return null;
    }
  }
}
