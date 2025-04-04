/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.code_engine.code_engine.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteBinding options.
 */
public class DeleteBindingOptions extends GenericModel {

  protected String projectId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteBindingOptions instance.
     *
     * @param deleteBindingOptions the instance to initialize the Builder with
     */
    private Builder(DeleteBindingOptions deleteBindingOptions) {
      this.projectId = deleteBindingOptions.projectId;
      this.id = deleteBindingOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param projectId the projectId
     * @param id the id
     */
    public Builder(String projectId, String id) {
      this.projectId = projectId;
      this.id = id;
    }

    /**
     * Builds a DeleteBindingOptions.
     *
     * @return the new DeleteBindingOptions instance
     */
    public DeleteBindingOptions build() {
      return new DeleteBindingOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the DeleteBindingOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteBindingOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteBindingOptions() { }

  protected DeleteBindingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    projectId = builder.projectId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteBindingOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the id.
   *
   * The id of your binding.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

