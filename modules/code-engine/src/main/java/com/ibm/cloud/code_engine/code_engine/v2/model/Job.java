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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Job is the response model for job resources.
 */
public class Job extends GenericModel {

  /**
   * The type of the job.
   */
  public interface ResourceType {
    /** job_v2. */
    String JOB_V2 = "job_v2";
  }

  /**
   * The mode for runs of the job. Valid values are `task` and `daemon`. In `task` mode, the `max_execution_time` and
   * `retry_limit` properties apply. In `daemon` mode, since there is no timeout and failed instances are restarted
   * indefinitely, the `max_execution_time` and `retry_limit` properties are not allowed.
   */
  public interface RunMode {
    /** task. */
    String TASK = "task";
    /** daemon. */
    String DAEMON = "daemon";
  }

  /**
   * The name of the service account. For built-in service accounts, you can use the shortened names `manager`, `none`,
   * `reader`, and `writer`. This property must not be set on a job run, which references a job template.
   */
  public interface RunServiceAccount {
    /** default. */
    String X_DEFAULT = "default";
    /** manager. */
    String MANAGER = "manager";
    /** reader. */
    String READER = "reader";
    /** writer. */
    String WRITER = "writer";
    /** none. */
    String NONE = "none";
  }

  protected String build;
  @SerializedName("build_run")
  protected String buildRun;
  @SerializedName("computed_env_variables")
  protected List<EnvVar> computedEnvVariables;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("entity_tag")
  protected String entityTag;
  protected String href;
  protected String id;
  @SerializedName("image_reference")
  protected String imageReference;
  @SerializedName("image_secret")
  protected String imageSecret;
  protected String name;
  @SerializedName("project_id")
  protected String projectId;
  protected String region;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("run_arguments")
  protected List<String> runArguments;
  @SerializedName("run_as_user")
  protected Long runAsUser;
  @SerializedName("run_commands")
  protected List<String> runCommands;
  @SerializedName("run_compute_resource_token_enabled")
  protected Boolean runComputeResourceTokenEnabled;
  @SerializedName("run_env_variables")
  protected List<EnvVar> runEnvVariables;
  @SerializedName("run_mode")
  protected String runMode;
  @SerializedName("run_service_account")
  protected String runServiceAccount;
  @SerializedName("run_volume_mounts")
  protected List<VolumeMount> runVolumeMounts;
  @SerializedName("scale_array_spec")
  protected String scaleArraySpec;
  @SerializedName("scale_cpu_limit")
  protected String scaleCpuLimit;
  @SerializedName("scale_ephemeral_storage_limit")
  protected String scaleEphemeralStorageLimit;
  @SerializedName("scale_max_execution_time")
  protected Long scaleMaxExecutionTime;
  @SerializedName("scale_memory_limit")
  protected String scaleMemoryLimit;
  @SerializedName("scale_retry_limit")
  protected Long scaleRetryLimit;

  protected Job() { }

  /**
   * Gets the build.
   *
   * Reference to a build that is associated with the job.
   *
   * @return the build
   */
  public String getBuild() {
    return build;
  }

  /**
   * Gets the buildRun.
   *
   * Reference to a build run that is associated with the job.
   *
   * @return the buildRun
   */
  public String getBuildRun() {
    return buildRun;
  }

  /**
   * Gets the computedEnvVariables.
   *
   * References to config maps, secrets or literal values, which are defined and set by Code Engine and are exposed as
   * environment variables in the job run.
   *
   * @return the computedEnvVariables
   */
  public List<EnvVar> getComputedEnvVariables() {
    return computedEnvVariables;
  }

  /**
   * Gets the createdAt.
   *
   * The timestamp when the resource was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the entityTag.
   *
   * The version of the job instance, which is used to achieve optimistic locking.
   *
   * @return the entityTag
   */
  public String getEntityTag() {
    return entityTag;
  }

  /**
   * Gets the href.
   *
   * When you provision a new job,  a URL is created identifying the location of the instance.
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
   * Gets the imageReference.
   *
   * The name of the image that is used for this job. The format is `REGISTRY/NAMESPACE/REPOSITORY:TAG` where `REGISTRY`
   * and `TAG` are optional. If `REGISTRY` is not specified, the default is `docker.io`. If `TAG` is not specified, the
   * default is `latest`. If the image reference points to a registry that requires authentication, make sure to also
   * specify the property `image_secret`.
   *
   * @return the imageReference
   */
  public String getImageReference() {
    return imageReference;
  }

  /**
   * Gets the imageSecret.
   *
   * The name of the image registry access secret. The image registry access secret is used to authenticate with a
   * private registry when you download the container image. If the image reference points to a registry that requires
   * authentication, the job / job runs will be created but submitted job runs will fail, until this property is
   * provided, too. This property must not be set on a job run, which references a job template.
   *
   * @return the imageSecret
   */
  public String getImageSecret() {
    return imageSecret;
  }

  /**
   * Gets the name.
   *
   * The name of the job.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project in which the resource is located.
   *
   * @return the projectId
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * Gets the region.
   *
   * The region of the project the resource is located in. Possible values: 'au-syd', 'br-sao', 'ca-tor', 'eu-de',
   * 'eu-gb', 'jp-osa', 'jp-tok', 'us-east', 'us-south'.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the resourceType.
   *
   * The type of the job.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the runArguments.
   *
   * Set arguments for the job that are passed to start job run containers. If not specified an empty string array will
   * be applied and the arguments specified by the container image, will be used to start the container.
   *
   * @return the runArguments
   */
  public List<String> getRunArguments() {
    return runArguments;
  }

  /**
   * Gets the runAsUser.
   *
   * The user ID (UID) to run the job.
   *
   * @return the runAsUser
   */
  public Long getRunAsUser() {
    return runAsUser;
  }

  /**
   * Gets the runCommands.
   *
   * Set commands for the job that are passed to start job run containers. If not specified an empty string array will
   * be applied and the command specified by the container image, will be used to start the container.
   *
   * @return the runCommands
   */
  public List<String> getRunCommands() {
    return runCommands;
  }

  /**
   * Gets the runComputeResourceTokenEnabled.
   *
   * Optional flag to enable the use of a compute resource token mounted to the container file system.
   *
   * @return the runComputeResourceTokenEnabled
   */
  public Boolean isRunComputeResourceTokenEnabled() {
    return runComputeResourceTokenEnabled;
  }

  /**
   * Gets the runEnvVariables.
   *
   * References to config maps, secrets or literal values, which are defined by the function owner and are exposed as
   * environment variables in the job run.
   *
   * @return the runEnvVariables
   */
  public List<EnvVar> getRunEnvVariables() {
    return runEnvVariables;
  }

  /**
   * Gets the runMode.
   *
   * The mode for runs of the job. Valid values are `task` and `daemon`. In `task` mode, the `max_execution_time` and
   * `retry_limit` properties apply. In `daemon` mode, since there is no timeout and failed instances are restarted
   * indefinitely, the `max_execution_time` and `retry_limit` properties are not allowed.
   *
   * @return the runMode
   */
  public String getRunMode() {
    return runMode;
  }

  /**
   * Gets the runServiceAccount.
   *
   * The name of the service account. For built-in service accounts, you can use the shortened names `manager`, `none`,
   * `reader`, and `writer`. This property must not be set on a job run, which references a job template.
   *
   * @return the runServiceAccount
   */
  public String getRunServiceAccount() {
    return runServiceAccount;
  }

  /**
   * Gets the runVolumeMounts.
   *
   * Optional mounts of config maps or secrets.
   *
   * @return the runVolumeMounts
   */
  public List<VolumeMount> getRunVolumeMounts() {
    return runVolumeMounts;
  }

  /**
   * Gets the scaleArraySpec.
   *
   * Define a custom set of array indices as a comma-separated list containing single values and hyphen-separated
   * ranges, such as  5,12-14,23,27. Each instance gets its array index value from the environment variable JOB_INDEX.
   * The number of unique array indices that you specify with this parameter determines the number of job instances to
   * run.
   *
   * @return the scaleArraySpec
   */
  public String getScaleArraySpec() {
    return scaleArraySpec;
  }

  /**
   * Gets the scaleCpuLimit.
   *
   * Optional amount of CPU set for the instance of the job. For valid values see [Supported memory and CPU
   * combinations](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo).
   *
   * @return the scaleCpuLimit
   */
  public String getScaleCpuLimit() {
    return scaleCpuLimit;
  }

  /**
   * Gets the scaleEphemeralStorageLimit.
   *
   * Optional amount of ephemeral storage to set for the instance of the job. The amount specified as ephemeral storage,
   * must not exceed the amount of `scale_memory_limit`. The units for specifying ephemeral storage are Megabyte (M) or
   * Gigabyte (G), whereas G and M are the shorthand expressions for GB and MB. For more information see [Units of
   * measurement](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo#unit-measurements).
   *
   * @return the scaleEphemeralStorageLimit
   */
  public String getScaleEphemeralStorageLimit() {
    return scaleEphemeralStorageLimit;
  }

  /**
   * Gets the scaleMaxExecutionTime.
   *
   * The maximum execution time in seconds for runs of the job. This property can only be specified if `run_mode` is
   * `task`.
   *
   * @return the scaleMaxExecutionTime
   */
  public Long getScaleMaxExecutionTime() {
    return scaleMaxExecutionTime;
  }

  /**
   * Gets the scaleMemoryLimit.
   *
   * Optional amount of memory set for the instance of the job. For valid values see [Supported memory and CPU
   * combinations](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo). The units for specifying
   * memory are Megabyte (M) or Gigabyte (G), whereas G and M are the shorthand expressions for GB and MB. For more
   * information see [Units of
   * measurement](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo#unit-measurements).
   *
   * @return the scaleMemoryLimit
   */
  public String getScaleMemoryLimit() {
    return scaleMemoryLimit;
  }

  /**
   * Gets the scaleRetryLimit.
   *
   * The number of times to rerun an instance of the job before the job is marked as failed. This property can only be
   * specified if `run_mode` is `task`.
   *
   * @return the scaleRetryLimit
   */
  public Long getScaleRetryLimit() {
    return scaleRetryLimit;
  }
}

