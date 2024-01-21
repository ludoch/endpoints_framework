/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-11-16 19:10:01 UTC)
 * on 2015-11-19 at 17:34:48 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.discovery.model;

/**
 * Model definition for RestMethod.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the APIs Discovery Service. For a detailed explanation
 * see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RestMethod extends com.google.api.client.json.GenericJson {

  /**
   * Description of this method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Whether this method requires an ETag to be specified. The ETag is sent as an HTTP If-Match or
   * If-None-Match header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean etagRequired;

  /**
   * HTTP method used by this method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String httpMethod;

  /**
   * A unique ID for this method. This property can be used to match methods between different
   * versions of Discovery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Media upload parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MediaUpload mediaUpload;

  /**
   * Ordered list of required parameters, serves as a hint to clients on how to structure their
   * method signatures. The array is ordered such that the "most-significant" parameter appears
   * first.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> parameterOrder;

  /**
   * Details for all parameters in this method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, JsonSchema> parameters;

  /**
   * The URI path of this REST method. Should be used in conjunction with the basePath property at
   * the api-level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * The schema for the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Request request;

  /**
   * The schema for the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Response response;

  /**
   * OAuth 2.0 scopes applicable to this method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> scopes;

  /**
   * Whether this method supports media downloads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean supportsMediaDownload;

  /**
   * Whether this method supports media uploads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean supportsMediaUpload;

  /**
   * Whether this method supports subscriptions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean supportsSubscription;

  /**
   * Indicates that downloads from this method should use the download service URL (i.e.
   * "/download"). Only applies if the method supports media download.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useMediaDownloadService;

  /**
   * Description of this method.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of this method.
   * @param description description or {@code null} for none
   */
  public RestMethod setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Whether this method requires an ETag to be specified. The ETag is sent as an HTTP If-Match or
   * If-None-Match header.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEtagRequired() {
    return etagRequired;
  }

  /**
   * Whether this method requires an ETag to be specified. The ETag is sent as an HTTP If-Match or
   * If-None-Match header.
   * @param etagRequired etagRequired or {@code null} for none
   */
  public RestMethod setEtagRequired(java.lang.Boolean etagRequired) {
    this.etagRequired = etagRequired;
    return this;
  }

  /**
   * HTTP method used by this method.
   * @return value or {@code null} for none
   */
  public java.lang.String getHttpMethod() {
    return httpMethod;
  }

  /**
   * HTTP method used by this method.
   * @param httpMethod httpMethod or {@code null} for none
   */
  public RestMethod setHttpMethod(java.lang.String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  /**
   * A unique ID for this method. This property can be used to match methods between different
   * versions of Discovery.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * A unique ID for this method. This property can be used to match methods between different
   * versions of Discovery.
   * @param id id or {@code null} for none
   */
  public RestMethod setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Media upload parameters.
   * @return value or {@code null} for none
   */
  public MediaUpload getMediaUpload() {
    return mediaUpload;
  }

  /**
   * Media upload parameters.
   * @param mediaUpload mediaUpload or {@code null} for none
   */
  public RestMethod setMediaUpload(MediaUpload mediaUpload) {
    this.mediaUpload = mediaUpload;
    return this;
  }

  /**
   * Ordered list of required parameters, serves as a hint to clients on how to structure their
   * method signatures. The array is ordered such that the "most-significant" parameter appears
   * first.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getParameterOrder() {
    return parameterOrder;
  }

  /**
   * Ordered list of required parameters, serves as a hint to clients on how to structure their
   * method signatures. The array is ordered such that the "most-significant" parameter appears
   * first.
   * @param parameterOrder parameterOrder or {@code null} for none
   */
  public RestMethod setParameterOrder(java.util.List<java.lang.String> parameterOrder) {
    this.parameterOrder = parameterOrder;
    return this;
  }

  /**
   * Details for all parameters in this method.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, JsonSchema> getParameters() {
    return parameters;
  }

  /**
   * Details for all parameters in this method.
   * @param parameters parameters or {@code null} for none
   */
  public RestMethod setParameters(java.util.Map<String, JsonSchema> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * The URI path of this REST method. Should be used in conjunction with the basePath property at
   * the api-level.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The URI path of this REST method. Should be used in conjunction with the basePath property at
   * the api-level.
   * @param path path or {@code null} for none
   */
  public RestMethod setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * The schema for the request.
   * @return value or {@code null} for none
   */
  public Request getRequest() {
    return request;
  }

  /**
   * The schema for the request.
   * @param request request or {@code null} for none
   */
  public RestMethod setRequest(Request request) {
    this.request = request;
    return this;
  }

  /**
   * The schema for the response.
   * @return value or {@code null} for none
   */
  public Response getResponse() {
    return response;
  }

  /**
   * The schema for the response.
   * @param response response or {@code null} for none
   */
  public RestMethod setResponse(Response response) {
    this.response = response;
    return this;
  }

  /**
   * OAuth 2.0 scopes applicable to this method.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getScopes() {
    return scopes;
  }

  /**
   * OAuth 2.0 scopes applicable to this method.
   * @param scopes scopes or {@code null} for none
   */
  public RestMethod setScopes(java.util.List<java.lang.String> scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * Whether this method supports media downloads.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSupportsMediaDownload() {
    return supportsMediaDownload;
  }

  /**
   * Whether this method supports media downloads.
   * @param supportsMediaDownload supportsMediaDownload or {@code null} for none
   */
  public RestMethod setSupportsMediaDownload(java.lang.Boolean supportsMediaDownload) {
    this.supportsMediaDownload = supportsMediaDownload;
    return this;
  }

  /**
   * Whether this method supports media uploads.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSupportsMediaUpload() {
    return supportsMediaUpload;
  }

  /**
   * Whether this method supports media uploads.
   * @param supportsMediaUpload supportsMediaUpload or {@code null} for none
   */
  public RestMethod setSupportsMediaUpload(java.lang.Boolean supportsMediaUpload) {
    this.supportsMediaUpload = supportsMediaUpload;
    return this;
  }

  /**
   * Whether this method supports subscriptions.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSupportsSubscription() {
    return supportsSubscription;
  }

  /**
   * Whether this method supports subscriptions.
   * @param supportsSubscription supportsSubscription or {@code null} for none
   */
  public RestMethod setSupportsSubscription(java.lang.Boolean supportsSubscription) {
    this.supportsSubscription = supportsSubscription;
    return this;
  }

  /**
   * Indicates that downloads from this method should use the download service URL (i.e.
   * "/download"). Only applies if the method supports media download.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseMediaDownloadService() {
    return useMediaDownloadService;
  }

  /**
   * Indicates that downloads from this method should use the download service URL (i.e.
   * "/download"). Only applies if the method supports media download.
   * @param useMediaDownloadService useMediaDownloadService or {@code null} for none
   */
  public RestMethod setUseMediaDownloadService(java.lang.Boolean useMediaDownloadService) {
    this.useMediaDownloadService = useMediaDownloadService;
    return this;
  }

  @Override
  public RestMethod set(String fieldName, Object value) {
    return (RestMethod) super.set(fieldName, value);
  }

  @Override
  public RestMethod clone() {
    return (RestMethod) super.clone();
  }

  /**
   * Media upload parameters.
   */
  public static final class MediaUpload extends com.google.api.client.json.GenericJson {

    /**
     * MIME Media Ranges for acceptable media uploads to this method.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> accept;

    /**
     * Maximum size of a media upload, such as "1MB", "2GB" or "3TB".
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String maxSize;

    /**
     * Supported upload protocols.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Protocols protocols;

    /**
     * MIME Media Ranges for acceptable media uploads to this method.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getAccept() {
      return accept;
    }

    /**
     * MIME Media Ranges for acceptable media uploads to this method.
     * @param accept accept or {@code null} for none
     */
    public MediaUpload setAccept(java.util.List<java.lang.String> accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Maximum size of a media upload, such as "1MB", "2GB" or "3TB".
     * @return value or {@code null} for none
     */
    public java.lang.String getMaxSize() {
      return maxSize;
    }

    /**
     * Maximum size of a media upload, such as "1MB", "2GB" or "3TB".
     * @param maxSize maxSize or {@code null} for none
     */
    public MediaUpload setMaxSize(java.lang.String maxSize) {
      this.maxSize = maxSize;
      return this;
    }

    /**
     * Supported upload protocols.
     * @return value or {@code null} for none
     */
    public Protocols getProtocols() {
      return protocols;
    }

    /**
     * Supported upload protocols.
     * @param protocols protocols or {@code null} for none
     */
    public MediaUpload setProtocols(Protocols protocols) {
      this.protocols = protocols;
      return this;
    }

    @Override
    public MediaUpload set(String fieldName, Object value) {
      return (MediaUpload) super.set(fieldName, value);
    }

    @Override
    public MediaUpload clone() {
      return (MediaUpload) super.clone();
    }

    /**
     * Supported upload protocols.
     */
    public static final class Protocols extends com.google.api.client.json.GenericJson {

      /**
       * Supports the Resumable Media Upload protocol.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private Resumable resumable;

      /**
       * Supports uploading as a single HTTP request.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private Simple simple;

      /**
       * Supports the Resumable Media Upload protocol.
       * @return value or {@code null} for none
       */
      public Resumable getResumable() {
        return resumable;
      }

      /**
       * Supports the Resumable Media Upload protocol.
       * @param resumable resumable or {@code null} for none
       */
      public Protocols setResumable(Resumable resumable) {
        this.resumable = resumable;
        return this;
      }

      /**
       * Supports uploading as a single HTTP request.
       * @return value or {@code null} for none
       */
      public Simple getSimple() {
        return simple;
      }

      /**
       * Supports uploading as a single HTTP request.
       * @param simple simple or {@code null} for none
       */
      public Protocols setSimple(Simple simple) {
        this.simple = simple;
        return this;
      }

      @Override
      public Protocols set(String fieldName, Object value) {
        return (Protocols) super.set(fieldName, value);
      }

      @Override
      public Protocols clone() {
        return (Protocols) super.clone();
      }

      /**
       * Supports the Resumable Media Upload protocol.
       */
      public static final class Resumable extends com.google.api.client.json.GenericJson {

        /**
         * True if this endpoint supports uploading multipart media.
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.Boolean multipart;

        /**
         * The URI path to be used for upload. Should be used in conjunction with the basePath property at
         * the api-level.
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String path;

        /**
         * True if this endpoint supports uploading multipart media.
         * @return value or {@code null} for none
         */
        public java.lang.Boolean getMultipart() {
          return multipart;
        }

        /**
         * True if this endpoint supports uploading multipart media.
         * @param multipart multipart or {@code null} for none
         */
        public Resumable setMultipart(java.lang.Boolean multipart) {
          this.multipart = multipart;
          return this;
        }

        /**
         * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
         *
         * <p>
         * Boolean properties can have four possible values:
         * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
         * or {@link Boolean#FALSE}.
         * </p>
         *
         * <p>
         * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
         * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
         * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
         * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
         * </p>
         *
         * <p>
         * True if this endpoint supports uploading multipart media.
         * </p>
         */
        public boolean isMultipart() {
          if (multipart == null || multipart == com.google.api.client.util.Data.NULL_BOOLEAN) {
            return true;
          }
          return multipart;
        }

        /**
         * The URI path to be used for upload. Should be used in conjunction with the basePath property at
         * the api-level.
         * @return value or {@code null} for none
         */
        public java.lang.String getPath() {
          return path;
        }

        /**
         * The URI path to be used for upload. Should be used in conjunction with the basePath property at
         * the api-level.
         * @param path path or {@code null} for none
         */
        public Resumable setPath(java.lang.String path) {
          this.path = path;
          return this;
        }

        @Override
        public Resumable set(String fieldName, Object value) {
          return (Resumable) super.set(fieldName, value);
        }

        @Override
        public Resumable clone() {
          return (Resumable) super.clone();
        }

      }
      /**
       * Supports uploading as a single HTTP request.
       */
      public static final class Simple extends com.google.api.client.json.GenericJson {

        /**
         * True if this endpoint supports upload multipart media.
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.Boolean multipart;

        /**
         * The URI path to be used for upload. Should be used in conjunction with the basePath property at
         * the api-level.
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String path;

        /**
         * True if this endpoint supports upload multipart media.
         * @return value or {@code null} for none
         */
        public java.lang.Boolean getMultipart() {
          return multipart;
        }

        /**
         * True if this endpoint supports upload multipart media.
         * @param multipart multipart or {@code null} for none
         */
        public Simple setMultipart(java.lang.Boolean multipart) {
          this.multipart = multipart;
          return this;
        }

        /**
         * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
         *
         * <p>
         * Boolean properties can have four possible values:
         * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
         * or {@link Boolean#FALSE}.
         * </p>
         *
         * <p>
         * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
         * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
         * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
         * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
         * </p>
         *
         * <p>
         * True if this endpoint supports upload multipart media.
         * </p>
         */
        public boolean isMultipart() {
          if (multipart == null || multipart == com.google.api.client.util.Data.NULL_BOOLEAN) {
            return true;
          }
          return multipart;
        }

        /**
         * The URI path to be used for upload. Should be used in conjunction with the basePath property at
         * the api-level.
         * @return value or {@code null} for none
         */
        public java.lang.String getPath() {
          return path;
        }

        /**
         * The URI path to be used for upload. Should be used in conjunction with the basePath property at
         * the api-level.
         * @param path path or {@code null} for none
         */
        public Simple setPath(java.lang.String path) {
          this.path = path;
          return this;
        }

        @Override
        public Simple set(String fieldName, Object value) {
          return (Simple) super.set(fieldName, value);
        }

        @Override
        public Simple clone() {
          return (Simple) super.clone();
        }

      }
    }
  }

  /**
   * The schema for the request.
   */
  public static final class Request extends com.google.api.client.json.GenericJson {

    /**
     * Schema ID for the request schema.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String $ref;

    /**
     * parameter name.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String parameterName;

    /**
     * Schema ID for the request schema.
     * @return value or {@code null} for none
     */
    public java.lang.String get$ref() {
      return $ref;
    }

    /**
     * Schema ID for the request schema.
     * @param $ref $ref or {@code null} for none
     */
    public Request set$ref(java.lang.String $ref) {
      this.$ref = $ref;
      return this;
    }

    /**
     * parameter name.
     * @return value or {@code null} for none
     */
    public java.lang.String getParameterName() {
      return parameterName;
    }

    /**
     * parameter name.
     * @param parameterName parameterName or {@code null} for none
     */
    public Request setParameterName(java.lang.String parameterName) {
      this.parameterName = parameterName;
      return this;
    }

    @Override
    public Request set(String fieldName, Object value) {
      return (Request) super.set(fieldName, value);
    }

    @Override
    public Request clone() {
      return (Request) super.clone();
    }

  }

  /**
   * The schema for the response.
   */
  public static final class Response extends com.google.api.client.json.GenericJson {

    /**
     * Schema ID for the response schema.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String $ref;

    /**
     * Schema ID for the response schema.
     * @return value or {@code null} for none
     */
    public java.lang.String get$ref() {
      return $ref;
    }

    /**
     * Schema ID for the response schema.
     * @param $ref $ref or {@code null} for none
     */
    public Response set$ref(java.lang.String $ref) {
      this.$ref = $ref;
      return this;
    }

    @Override
    public Response set(String fieldName, Object value) {
      return (Response) super.set(fieldName, value);
    }

    @Override
    public Response clone() {
      return (Response) super.clone();
    }

  }

}
