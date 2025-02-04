/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.recommender.v1beta1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.cloud.recommender.v1beta1.stub.RecommenderStub;
import com.google.cloud.recommender.v1beta1.stub.RecommenderStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Provides recommendations for cloud customers for various categories like
 * performance optimization, cost savings, reliability, feature discovery, etc. These
 * recommendations are generated automatically based on analysis of user resources, configuration
 * and monitoring metrics.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
 *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
 *   Recommendation response = recommenderClient.getRecommendation(formattedName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the recommenderClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of RecommenderSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * RecommenderSettings recommenderSettings =
 *     RecommenderSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RecommenderClient recommenderClient =
 *     RecommenderClient.create(recommenderSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RecommenderSettings recommenderSettings =
 *     RecommenderSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RecommenderClient recommenderClient =
 *     RecommenderClient.create(recommenderSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RecommenderClient implements BackgroundResource {
  private final RecommenderSettings settings;
  private final RecommenderStub stub;

  private static final PathTemplate RECOMMENDATION_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/recommenders/{recommender}/recommendations/{recommendation}");

  private static final PathTemplate RECOMMENDER_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/recommenders/{recommender}");

  /**
   * Formats a string containing the fully-qualified path to represent a recommendation resource.
   *
   * @deprecated Use the {@link RecommendationName} class instead.
   */
  @Deprecated
  public static final String formatRecommendationName(
      String project, String location, String recommender, String recommendation) {
    return RECOMMENDATION_PATH_TEMPLATE.instantiate(
        "project", project,
        "location", location,
        "recommender", recommender,
        "recommendation", recommendation);
  }

  /**
   * Formats a string containing the fully-qualified path to represent a recommender resource.
   *
   * @deprecated Use the {@link RecommenderName} class instead.
   */
  @Deprecated
  public static final String formatRecommenderName(
      String project, String location, String recommender) {
    return RECOMMENDER_PATH_TEMPLATE.instantiate(
        "project", project,
        "location", location,
        "recommender", recommender);
  }

  /**
   * Parses the project from the given fully-qualified path which represents a recommendation
   * resource.
   *
   * @deprecated Use the {@link RecommendationName} class instead.
   */
  @Deprecated
  public static final String parseProjectFromRecommendationName(String recommendationName) {
    return RECOMMENDATION_PATH_TEMPLATE.parse(recommendationName).get("project");
  }

  /**
   * Parses the location from the given fully-qualified path which represents a recommendation
   * resource.
   *
   * @deprecated Use the {@link RecommendationName} class instead.
   */
  @Deprecated
  public static final String parseLocationFromRecommendationName(String recommendationName) {
    return RECOMMENDATION_PATH_TEMPLATE.parse(recommendationName).get("location");
  }

  /**
   * Parses the recommender from the given fully-qualified path which represents a recommendation
   * resource.
   *
   * @deprecated Use the {@link RecommendationName} class instead.
   */
  @Deprecated
  public static final String parseRecommenderFromRecommendationName(String recommendationName) {
    return RECOMMENDATION_PATH_TEMPLATE.parse(recommendationName).get("recommender");
  }

  /**
   * Parses the recommendation from the given fully-qualified path which represents a recommendation
   * resource.
   *
   * @deprecated Use the {@link RecommendationName} class instead.
   */
  @Deprecated
  public static final String parseRecommendationFromRecommendationName(String recommendationName) {
    return RECOMMENDATION_PATH_TEMPLATE.parse(recommendationName).get("recommendation");
  }

  /**
   * Parses the project from the given fully-qualified path which represents a recommender resource.
   *
   * @deprecated Use the {@link RecommenderName} class instead.
   */
  @Deprecated
  public static final String parseProjectFromRecommenderName(String recommenderName) {
    return RECOMMENDER_PATH_TEMPLATE.parse(recommenderName).get("project");
  }

  /**
   * Parses the location from the given fully-qualified path which represents a recommender
   * resource.
   *
   * @deprecated Use the {@link RecommenderName} class instead.
   */
  @Deprecated
  public static final String parseLocationFromRecommenderName(String recommenderName) {
    return RECOMMENDER_PATH_TEMPLATE.parse(recommenderName).get("location");
  }

  /**
   * Parses the recommender from the given fully-qualified path which represents a recommender
   * resource.
   *
   * @deprecated Use the {@link RecommenderName} class instead.
   */
  @Deprecated
  public static final String parseRecommenderFromRecommenderName(String recommenderName) {
    return RECOMMENDER_PATH_TEMPLATE.parse(recommenderName).get("recommender");
  }

  /** Constructs an instance of RecommenderClient with default settings. */
  public static final RecommenderClient create() throws IOException {
    return create(RecommenderSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RecommenderClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final RecommenderClient create(RecommenderSettings settings) throws IOException {
    return new RecommenderClient(settings);
  }

  /**
   * Constructs an instance of RecommenderClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use RecommenderSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final RecommenderClient create(RecommenderStub stub) {
    return new RecommenderClient(stub);
  }

  /**
   * Constructs an instance of RecommenderClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected RecommenderClient(RecommenderSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((RecommenderStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected RecommenderClient(RecommenderStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RecommenderSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RecommenderStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists recommendations for a Cloud project. Requires the recommender.&#42;.list IAM permission
   * for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedParent = RecommenderClient.formatRecommenderName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]");
   *   for (Recommendation element : recommenderClient.listRecommendations(formattedParent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The container resource on which to execute the request. Acceptable
   *     formats:
   *     <p>1. "projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]",
   *     <p>LOCATION here refers to GCP Locations: https://cloud.google.com/about/locations/
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRecommendationsPagedResponse listRecommendations(String parent) {
    RECOMMENDER_PATH_TEMPLATE.validate(parent, "listRecommendations");
    ListRecommendationsRequest request =
        ListRecommendationsRequest.newBuilder().setParent(parent).build();
    return listRecommendations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists recommendations for a Cloud project. Requires the recommender.&#42;.list IAM permission
   * for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedParent = RecommenderClient.formatRecommenderName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]");
   *   ListRecommendationsRequest request = ListRecommendationsRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .build();
   *   for (Recommendation element : recommenderClient.listRecommendations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRecommendationsPagedResponse listRecommendations(
      ListRecommendationsRequest request) {
    return listRecommendationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists recommendations for a Cloud project. Requires the recommender.&#42;.list IAM permission
   * for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedParent = RecommenderClient.formatRecommenderName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]");
   *   ListRecommendationsRequest request = ListRecommendationsRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .build();
   *   ApiFuture&lt;ListRecommendationsPagedResponse&gt; future = recommenderClient.listRecommendationsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Recommendation element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListRecommendationsRequest, ListRecommendationsPagedResponse>
      listRecommendationsPagedCallable() {
    return stub.listRecommendationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists recommendations for a Cloud project. Requires the recommender.&#42;.list IAM permission
   * for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedParent = RecommenderClient.formatRecommenderName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]");
   *   ListRecommendationsRequest request = ListRecommendationsRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .build();
   *   while (true) {
   *     ListRecommendationsResponse response = recommenderClient.listRecommendationsCallable().call(request);
   *     for (Recommendation element : response.getRecommendationsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListRecommendationsRequest, ListRecommendationsResponse>
      listRecommendationsCallable() {
    return stub.listRecommendationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the requested recommendation. Requires the recommender.&#42;.get IAM permission for the
   * specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   Recommendation response = recommenderClient.getRecommendation(formattedName);
   * }
   * </code></pre>
   *
   * @param name Name of the recommendation.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation getRecommendation(String name) {
    RECOMMENDATION_PATH_TEMPLATE.validate(name, "getRecommendation");
    GetRecommendationRequest request = GetRecommendationRequest.newBuilder().setName(name).build();
    return getRecommendation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the requested recommendation. Requires the recommender.&#42;.get IAM permission for the
   * specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   GetRecommendationRequest request = GetRecommendationRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   Recommendation response = recommenderClient.getRecommendation(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation getRecommendation(GetRecommendationRequest request) {
    return getRecommendationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the requested recommendation. Requires the recommender.&#42;.get IAM permission for the
   * specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   GetRecommendationRequest request = GetRecommendationRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   ApiFuture&lt;Recommendation&gt; future = recommenderClient.getRecommendationCallable().futureCall(request);
   *   // Do something
   *   Recommendation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetRecommendationRequest, Recommendation> getRecommendationCallable() {
    return stub.getRecommendationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mark the Recommendation State as Claimed. Users can use this method to indicate to the
   * Recommender API that they are starting to apply the recommendation themselves. This stops the
   * recommendation content from being updated.
   *
   * <p>MarkRecommendationClaimed can be applied to recommendations in CLAIMED, SUCCEEDED, FAILED,
   * or ACTIVE state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   String etag = "";
   *   Recommendation response = recommenderClient.markRecommendationClaimed(formattedName, etag);
   * }
   * </code></pre>
   *
   * @param name Name of the recommendation.
   * @param etag Fingerprint of the Recommendation. Provides optimistic locking.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationClaimed(String name, String etag) {
    RECOMMENDATION_PATH_TEMPLATE.validate(name, "markRecommendationClaimed");
    MarkRecommendationClaimedRequest request =
        MarkRecommendationClaimedRequest.newBuilder().setName(name).setEtag(etag).build();
    return markRecommendationClaimed(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mark the Recommendation State as Claimed. Users can use this method to indicate to the
   * Recommender API that they are starting to apply the recommendation themselves. This stops the
   * recommendation content from being updated.
   *
   * <p>MarkRecommendationClaimed can be applied to recommendations in CLAIMED, SUCCEEDED, FAILED,
   * or ACTIVE state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   String etag = "";
   *   MarkRecommendationClaimedRequest request = MarkRecommendationClaimedRequest.newBuilder()
   *     .setName(formattedName)
   *     .setEtag(etag)
   *     .build();
   *   Recommendation response = recommenderClient.markRecommendationClaimed(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationClaimed(MarkRecommendationClaimedRequest request) {
    return markRecommendationClaimedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mark the Recommendation State as Claimed. Users can use this method to indicate to the
   * Recommender API that they are starting to apply the recommendation themselves. This stops the
   * recommendation content from being updated.
   *
   * <p>MarkRecommendationClaimed can be applied to recommendations in CLAIMED, SUCCEEDED, FAILED,
   * or ACTIVE state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   String etag = "";
   *   MarkRecommendationClaimedRequest request = MarkRecommendationClaimedRequest.newBuilder()
   *     .setName(formattedName)
   *     .setEtag(etag)
   *     .build();
   *   ApiFuture&lt;Recommendation&gt; future = recommenderClient.markRecommendationClaimedCallable().futureCall(request);
   *   // Do something
   *   Recommendation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MarkRecommendationClaimedRequest, Recommendation>
      markRecommendationClaimedCallable() {
    return stub.markRecommendationClaimedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mark the Recommendation State as Succeeded. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation was
   * successful. This stops the recommendation content from being updated.
   *
   * <p>MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED,
   * or FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   String etag = "";
   *   Recommendation response = recommenderClient.markRecommendationSucceeded(formattedName, etag);
   * }
   * </code></pre>
   *
   * @param name Name of the recommendation.
   * @param etag Fingerprint of the Recommendation. Provides optimistic locking.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationSucceeded(String name, String etag) {
    RECOMMENDATION_PATH_TEMPLATE.validate(name, "markRecommendationSucceeded");
    MarkRecommendationSucceededRequest request =
        MarkRecommendationSucceededRequest.newBuilder().setName(name).setEtag(etag).build();
    return markRecommendationSucceeded(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mark the Recommendation State as Succeeded. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation was
   * successful. This stops the recommendation content from being updated.
   *
   * <p>MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED,
   * or FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   String etag = "";
   *   MarkRecommendationSucceededRequest request = MarkRecommendationSucceededRequest.newBuilder()
   *     .setName(formattedName)
   *     .setEtag(etag)
   *     .build();
   *   Recommendation response = recommenderClient.markRecommendationSucceeded(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationSucceeded(
      MarkRecommendationSucceededRequest request) {
    return markRecommendationSucceededCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mark the Recommendation State as Succeeded. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation was
   * successful. This stops the recommendation content from being updated.
   *
   * <p>MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED,
   * or FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   String etag = "";
   *   MarkRecommendationSucceededRequest request = MarkRecommendationSucceededRequest.newBuilder()
   *     .setName(formattedName)
   *     .setEtag(etag)
   *     .build();
   *   ApiFuture&lt;Recommendation&gt; future = recommenderClient.markRecommendationSucceededCallable().futureCall(request);
   *   // Do something
   *   Recommendation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MarkRecommendationSucceededRequest, Recommendation>
      markRecommendationSucceededCallable() {
    return stub.markRecommendationSucceededCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mark the Recommendation State as Failed. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation failed.
   * This stops the recommendation content from being updated.
   *
   * <p>MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or
   * FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   String etag = "";
   *   Recommendation response = recommenderClient.markRecommendationFailed(formattedName, etag);
   * }
   * </code></pre>
   *
   * @param name Name of the recommendation.
   * @param etag Fingerprint of the Recommendation. Provides optimistic locking.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationFailed(String name, String etag) {
    RECOMMENDATION_PATH_TEMPLATE.validate(name, "markRecommendationFailed");
    MarkRecommendationFailedRequest request =
        MarkRecommendationFailedRequest.newBuilder().setName(name).setEtag(etag).build();
    return markRecommendationFailed(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mark the Recommendation State as Failed. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation failed.
   * This stops the recommendation content from being updated.
   *
   * <p>MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or
   * FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   String etag = "";
   *   MarkRecommendationFailedRequest request = MarkRecommendationFailedRequest.newBuilder()
   *     .setName(formattedName)
   *     .setEtag(etag)
   *     .build();
   *   Recommendation response = recommenderClient.markRecommendationFailed(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationFailed(MarkRecommendationFailedRequest request) {
    return markRecommendationFailedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mark the Recommendation State as Failed. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation failed.
   * This stops the recommendation content from being updated.
   *
   * <p>MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or
   * FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String formattedName = RecommenderClient.formatRecommendationName("[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   String etag = "";
   *   MarkRecommendationFailedRequest request = MarkRecommendationFailedRequest.newBuilder()
   *     .setName(formattedName)
   *     .setEtag(etag)
   *     .build();
   *   ApiFuture&lt;Recommendation&gt; future = recommenderClient.markRecommendationFailedCallable().futureCall(request);
   *   // Do something
   *   Recommendation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MarkRecommendationFailedRequest, Recommendation>
      markRecommendationFailedCallable() {
    return stub.markRecommendationFailedCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListRecommendationsPagedResponse
      extends AbstractPagedListResponse<
          ListRecommendationsRequest,
          ListRecommendationsResponse,
          Recommendation,
          ListRecommendationsPage,
          ListRecommendationsFixedSizeCollection> {

    public static ApiFuture<ListRecommendationsPagedResponse> createAsync(
        PageContext<ListRecommendationsRequest, ListRecommendationsResponse, Recommendation>
            context,
        ApiFuture<ListRecommendationsResponse> futureResponse) {
      ApiFuture<ListRecommendationsPage> futurePage =
          ListRecommendationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListRecommendationsPage, ListRecommendationsPagedResponse>() {
            @Override
            public ListRecommendationsPagedResponse apply(ListRecommendationsPage input) {
              return new ListRecommendationsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListRecommendationsPagedResponse(ListRecommendationsPage page) {
      super(page, ListRecommendationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListRecommendationsPage
      extends AbstractPage<
          ListRecommendationsRequest,
          ListRecommendationsResponse,
          Recommendation,
          ListRecommendationsPage> {

    private ListRecommendationsPage(
        PageContext<ListRecommendationsRequest, ListRecommendationsResponse, Recommendation>
            context,
        ListRecommendationsResponse response) {
      super(context, response);
    }

    private static ListRecommendationsPage createEmptyPage() {
      return new ListRecommendationsPage(null, null);
    }

    @Override
    protected ListRecommendationsPage createPage(
        PageContext<ListRecommendationsRequest, ListRecommendationsResponse, Recommendation>
            context,
        ListRecommendationsResponse response) {
      return new ListRecommendationsPage(context, response);
    }

    @Override
    public ApiFuture<ListRecommendationsPage> createPageAsync(
        PageContext<ListRecommendationsRequest, ListRecommendationsResponse, Recommendation>
            context,
        ApiFuture<ListRecommendationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListRecommendationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRecommendationsRequest,
          ListRecommendationsResponse,
          Recommendation,
          ListRecommendationsPage,
          ListRecommendationsFixedSizeCollection> {

    private ListRecommendationsFixedSizeCollection(
        List<ListRecommendationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRecommendationsFixedSizeCollection createEmptyCollection() {
      return new ListRecommendationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRecommendationsFixedSizeCollection createCollection(
        List<ListRecommendationsPage> pages, int collectionSize) {
      return new ListRecommendationsFixedSizeCollection(pages, collectionSize);
    }
  }
}
