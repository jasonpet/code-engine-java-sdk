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
package com.ibm.cloud.code_engine.code_engine.v2.model;

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Describes the model of a secret.
 */
public class Secret extends GenericModel {

  /**
   * Specify the format of the secret.
   */
  public interface Format {
    /** generic. */
    String GENERIC = "generic";
    /** ssh_auth. */
    String SSH_AUTH = "ssh_auth";
    /** basic_auth. */
    String BASIC_AUTH = "basic_auth";
    /** tls. */
    String TLS = "tls";
    /** service_access. */
    String SERVICE_ACCESS = "service_access";
    /** registry. */
    String REGISTRY = "registry";
    /** other. */
    String OTHER = "other";
  }

  @SerializedName("created_at")
  protected String createdAt;
  protected Map<String, String> data;
  @SerializedName("entity_tag")
  protected String entityTag;
  protected String format;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("project_id")
  protected String projectId;
  @SerializedName("resource_type")
  protected String resourceType;

  protected Secret() { }

  /**
   * Gets the createdAt.
   *
   * The date when the resource was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the data.
   *
   * Data container that allows to specify config parameters and their values as a key-value map. Each key field must
   * consist of alphanumeric characters, `-`, `_` or `.` and must not be exceed a max length of 253 characters. Each
   * value field can consists of any character and must not be exceed a max length of 1048576 characters.
   *
   * @return the data
   */
  public Map<String, String> getData() {
    return data;
  }

  /**
   * Gets the entityTag.
   *
   * The version of the secret instance, which is used to achieve optimistic locking.
   *
   * @return the entityTag
   */
  public String getEntityTag() {
    return entityTag;
  }

  /**
   * Gets the format.
   *
   * Specify the format of the secret.
   *
   * @return the format
   */
  public String getFormat() {
    return format;
  }

  /**
   * Gets the href.
   *
   * When you provision a new secret,  a URL is created identifying the location of the instance.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The identifier of the resource.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name of the secret.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project the resource is located in.
   *
   * @return the projectId
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * Gets the resourceType.
   *
   * The type of the secret.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }
}

