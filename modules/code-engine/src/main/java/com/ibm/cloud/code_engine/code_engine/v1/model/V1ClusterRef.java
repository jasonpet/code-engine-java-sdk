/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.code_engine.code_engine.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * V1ClusterRef.
 */
public class V1ClusterRef extends GenericModel {

  protected V1Cluster cluster;
  protected String name;

  protected V1ClusterRef() { }

  /**
   * Gets the cluster.
   *
   * @return the cluster
   */
  public V1Cluster getCluster() {
    return cluster;
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

