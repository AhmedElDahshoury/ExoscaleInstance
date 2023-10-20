# DbaasApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDbaasIntegration**](DbaasApi.md#createDbaasIntegration) | **POST** /dbaas-integration | Create a new DBaaS integration between two services |
| [**createDbaasKafkaSchemaRegistryAclConfig**](DbaasApi.md#createDbaasKafkaSchemaRegistryAclConfig) | **POST** /dbaas-kafka/{name}/schema-registry/acl-config | Add a Kafka Schema Registry ACL entry |
| [**createDbaasKafkaTopicAclConfig**](DbaasApi.md#createDbaasKafkaTopicAclConfig) | **POST** /dbaas-kafka/{name}/topic/acl-config | Add a Kafka topic ACL entry |
| [**createDbaasKafkaUser**](DbaasApi.md#createDbaasKafkaUser) | **POST** /dbaas-kafka/{service-name}/user | Create a DBaaS Kafka user |
| [**createDbaasMysqlDatabase**](DbaasApi.md#createDbaasMysqlDatabase) | **POST** /dbaas-mysql/{service-name}/database | Create a DBaaS MySQL database |
| [**createDbaasMysqlUser**](DbaasApi.md#createDbaasMysqlUser) | **POST** /dbaas-mysql/{service-name}/user | Create a DBaaS MySQL user |
| [**createDbaasOpensearchUser**](DbaasApi.md#createDbaasOpensearchUser) | **POST** /dbaas-opensearch/{service-name}/user | Create a DBaaS OpenSearch user |
| [**createDbaasPgConnectionPool**](DbaasApi.md#createDbaasPgConnectionPool) | **POST** /dbaas-postgres/{service-name}/connection-pool | Create a DBaaS PostgreSQL connection pool |
| [**createDbaasPgDatabase**](DbaasApi.md#createDbaasPgDatabase) | **POST** /dbaas-postgres/{service-name}/database | Create a DBaaS Postgres database |
| [**createDbaasPgUpgradeCheck**](DbaasApi.md#createDbaasPgUpgradeCheck) | **POST** /dbaas-postgres/{service}/upgrade-check |  |
| [**createDbaasPostgresUser**](DbaasApi.md#createDbaasPostgresUser) | **POST** /dbaas-postgres/{service-name}/user | Create a DBaaS Postgres user |
| [**createDbaasServiceGrafana**](DbaasApi.md#createDbaasServiceGrafana) | **POST** /dbaas-grafana/{name} |  |
| [**createDbaasServiceKafka**](DbaasApi.md#createDbaasServiceKafka) | **POST** /dbaas-kafka/{name} | Create a DBaaS Kafka service |
| [**createDbaasServiceMysql**](DbaasApi.md#createDbaasServiceMysql) | **POST** /dbaas-mysql/{name} | Create a DBaaS MySQL service |
| [**createDbaasServiceOpensearch**](DbaasApi.md#createDbaasServiceOpensearch) | **POST** /dbaas-opensearch/{name} | Create a DBaaS OpenSearch service |
| [**createDbaasServicePg**](DbaasApi.md#createDbaasServicePg) | **POST** /dbaas-postgres/{name} | Create a DBaaS PostgreSQL service |
| [**createDbaasServiceRedis**](DbaasApi.md#createDbaasServiceRedis) | **POST** /dbaas-redis/{name} | Create a DBaaS Redis service |
| [**createDbaasTaskMigrationCheck**](DbaasApi.md#createDbaasTaskMigrationCheck) | **POST** /dbaas-task-migration-check/{service} |  |
| [**deleteDbaasIntegration**](DbaasApi.md#deleteDbaasIntegration) | **DELETE** /dbaas-integration/{id} | Delete a DBaaS Integration |
| [**deleteDbaasKafkaSchemaRegistryAclConfig**](DbaasApi.md#deleteDbaasKafkaSchemaRegistryAclConfig) | **DELETE** /dbaas-kafka/{name}/schema-registry/acl-config/{acl-id} | Delete a Kafka ACL entry |
| [**deleteDbaasKafkaTopicAclConfig**](DbaasApi.md#deleteDbaasKafkaTopicAclConfig) | **DELETE** /dbaas-kafka/{name}/topic/acl-config/{acl-id} | Delete a Kafka ACL entry |
| [**deleteDbaasKafkaUser**](DbaasApi.md#deleteDbaasKafkaUser) | **DELETE** /dbaas-kafka/{service-name}/user/{username} | Delete a DBaaS kafka user |
| [**deleteDbaasMysqlDatabase**](DbaasApi.md#deleteDbaasMysqlDatabase) | **DELETE** /dbaas-mysql/{service-name}/database/{database-name} | Delete a DBaaS MySQL database |
| [**deleteDbaasMysqlUser**](DbaasApi.md#deleteDbaasMysqlUser) | **DELETE** /dbaas-mysql/{service-name}/user/{username} | Delete a DBaaS MySQL user |
| [**deleteDbaasOpensearchUser**](DbaasApi.md#deleteDbaasOpensearchUser) | **DELETE** /dbaas-opensearch/{service-name}/user/{username} | Delete a DBaaS OpenSearch user |
| [**deleteDbaasPgConnectionPool**](DbaasApi.md#deleteDbaasPgConnectionPool) | **DELETE** /dbaas-postgres/{service-name}/connection-pool/{connection-pool-name} | Delete a DBaaS PostgreSQL connection pool |
| [**deleteDbaasPgDatabase**](DbaasApi.md#deleteDbaasPgDatabase) | **DELETE** /dbaas-postgres/{service-name}/database/{database-name} | Delete a DBaaS Postgres database |
| [**deleteDbaasPostgresUser**](DbaasApi.md#deleteDbaasPostgresUser) | **DELETE** /dbaas-postgres/{service-name}/user/{username} | Delete a DBaaS Postgres user |
| [**deleteDbaasService**](DbaasApi.md#deleteDbaasService) | **DELETE** /dbaas-service/{name} | Delete a DBaaS service |
| [**deleteDbaasServiceGrafana**](DbaasApi.md#deleteDbaasServiceGrafana) | **DELETE** /dbaas-grafana/{name} | Delete a Grafana service |
| [**deleteDbaasServiceKafka**](DbaasApi.md#deleteDbaasServiceKafka) | **DELETE** /dbaas-kafka/{name} | Delete a Kafka service |
| [**deleteDbaasServiceMysql**](DbaasApi.md#deleteDbaasServiceMysql) | **DELETE** /dbaas-mysql/{name} | Delete a MySQL service |
| [**deleteDbaasServiceOpensearch**](DbaasApi.md#deleteDbaasServiceOpensearch) | **DELETE** /dbaas-opensearch/{name} | Delete a OpenSearch service |
| [**deleteDbaasServicePg**](DbaasApi.md#deleteDbaasServicePg) | **DELETE** /dbaas-postgres/{name} | Delete a Postgres service |
| [**deleteDbaasServiceRedis**](DbaasApi.md#deleteDbaasServiceRedis) | **DELETE** /dbaas-redis/{name} | Delete a Redis service |
| [**getDbaasCaCertificate**](DbaasApi.md#getDbaasCaCertificate) | **GET** /dbaas-ca-certificate | Get DBaaS CA Certificate |
| [**getDbaasIntegration**](DbaasApi.md#getDbaasIntegration) | **GET** /dbaas-integration/{id} | Get a DBaaS Integration |
| [**getDbaasKafkaAclConfig**](DbaasApi.md#getDbaasKafkaAclConfig) | **GET** /dbaas-kafka/{name}/acl-config | Get DBaaS kafka ACL configuration |
| [**getDbaasMigrationStatus**](DbaasApi.md#getDbaasMigrationStatus) | **GET** /dbaas-migration-status/{name} | Get a DBaaS migration status |
| [**getDbaasOpensearchAclConfig**](DbaasApi.md#getDbaasOpensearchAclConfig) | **GET** /dbaas-opensearch/{name}/acl-config | Get DBaaS OpenSearch ACL configuration |
| [**getDbaasServiceGrafana**](DbaasApi.md#getDbaasServiceGrafana) | **GET** /dbaas-grafana/{name} | Get a DBaaS Grafana service |
| [**getDbaasServiceKafka**](DbaasApi.md#getDbaasServiceKafka) | **GET** /dbaas-kafka/{name} | Get a DBaaS Kafka service |
| [**getDbaasServiceLogs**](DbaasApi.md#getDbaasServiceLogs) | **POST** /dbaas-service-logs/{service-name} | Get logs of DBaaS service |
| [**getDbaasServiceMetrics**](DbaasApi.md#getDbaasServiceMetrics) | **POST** /dbaas-service-metrics/{service-name} | Get metrics of DBaaS service |
| [**getDbaasServiceMysql**](DbaasApi.md#getDbaasServiceMysql) | **GET** /dbaas-mysql/{name} | Get a DBaaS MySQL service |
| [**getDbaasServiceOpensearch**](DbaasApi.md#getDbaasServiceOpensearch) | **GET** /dbaas-opensearch/{name} | Get a DBaaS OpenSearch service |
| [**getDbaasServicePg**](DbaasApi.md#getDbaasServicePg) | **GET** /dbaas-postgres/{name} | Get a DBaaS PostgreSQL service |
| [**getDbaasServiceRedis**](DbaasApi.md#getDbaasServiceRedis) | **GET** /dbaas-redis/{name} | Get a DBaaS Redis service |
| [**getDbaasServiceType**](DbaasApi.md#getDbaasServiceType) | **GET** /dbaas-service-type/{service-type-name} | Get a DBaaS service type |
| [**getDbaasSettingsGrafana**](DbaasApi.md#getDbaasSettingsGrafana) | **GET** /dbaas-settings-grafana | Get DBaaS Grafana settings |
| [**getDbaasSettingsKafka**](DbaasApi.md#getDbaasSettingsKafka) | **GET** /dbaas-settings-kafka | Get DBaaS Kafka settings |
| [**getDbaasSettingsMysql**](DbaasApi.md#getDbaasSettingsMysql) | **GET** /dbaas-settings-mysql | Get DBaaS MySQL settings |
| [**getDbaasSettingsOpensearch**](DbaasApi.md#getDbaasSettingsOpensearch) | **GET** /dbaas-settings-opensearch | Get DBaaS OpenSearch settings |
| [**getDbaasSettingsPg**](DbaasApi.md#getDbaasSettingsPg) | **GET** /dbaas-settings-pg | Get DBaaS PostgreSQL settings |
| [**getDbaasSettingsRedis**](DbaasApi.md#getDbaasSettingsRedis) | **GET** /dbaas-settings-redis | Get DBaaS Redis settings |
| [**getDbaasTask**](DbaasApi.md#getDbaasTask) | **GET** /dbaas-task/{service}/{id} | Get a DBaaS task |
| [**listDbaasIntegrationSettings**](DbaasApi.md#listDbaasIntegrationSettings) | **GET** /dbaas-integration-settings/{integration-type}/{source-type}/{dest-type} | Get DBaaS integration settings |
| [**listDbaasIntegrationTypes**](DbaasApi.md#listDbaasIntegrationTypes) | **GET** /dbaas-integration-types | Get DBaaS integration types |
| [**listDbaasServiceTypes**](DbaasApi.md#listDbaasServiceTypes) | **GET** /dbaas-service-type | DBaaS Service Types |
| [**listDbaasServices**](DbaasApi.md#listDbaasServices) | **GET** /dbaas-service | List DBaaS services |
| [**resetDbaasKafkaUserPassword**](DbaasApi.md#resetDbaasKafkaUserPassword) | **PUT** /dbaas-kafka/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Kafka user |
| [**resetDbaasMysqlUserPassword**](DbaasApi.md#resetDbaasMysqlUserPassword) | **PUT** /dbaas-mysql/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS mysql user |
| [**resetDbaasOpensearchUserPassword**](DbaasApi.md#resetDbaasOpensearchUserPassword) | **PUT** /dbaas-opensearch/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS OpenSearch user |
| [**resetDbaasPostgresUserPassword**](DbaasApi.md#resetDbaasPostgresUserPassword) | **PUT** /dbaas-postgres/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Postgres user |
| [**startDbaasGrafanaMaintenance**](DbaasApi.md#startDbaasGrafanaMaintenance) | **PUT** /dbaas-grafana/{name}/maintenance/start | Initiate Grafana maintenance update |
| [**startDbaasKafkaMaintenance**](DbaasApi.md#startDbaasKafkaMaintenance) | **PUT** /dbaas-kafka/{name}/maintenance/start | Initiate Kafka maintenance update |
| [**startDbaasMysqlMaintenance**](DbaasApi.md#startDbaasMysqlMaintenance) | **PUT** /dbaas-mysql/{name}/maintenance/start | Initiate MySQL maintenance update |
| [**startDbaasOpensearchMaintenance**](DbaasApi.md#startDbaasOpensearchMaintenance) | **PUT** /dbaas-opensearch/{name}/maintenance/start | Initiate OpenSearch maintenance update |
| [**startDbaasPgMaintenance**](DbaasApi.md#startDbaasPgMaintenance) | **PUT** /dbaas-postgres/{name}/maintenance/start | Initiate PostgreSQL maintenance update |
| [**startDbaasRedisMaintenance**](DbaasApi.md#startDbaasRedisMaintenance) | **PUT** /dbaas-redis/{name}/maintenance/start | Initiate Redis maintenance update |
| [**stopDbaasMysqlMigration**](DbaasApi.md#stopDbaasMysqlMigration) | **POST** /dbaas-mysql/{name}/migration/stop | Stop a DBaaS MySQL migration |
| [**stopDbaasPgMigration**](DbaasApi.md#stopDbaasPgMigration) | **POST** /dbaas-postgres/{name}/migration/stop | Stop a DBaaS PostgreSQL migration |
| [**stopDbaasRedisMigration**](DbaasApi.md#stopDbaasRedisMigration) | **POST** /dbaas-redis/{name}/migration/stop | Stop a DBaaS Redis migration |
| [**updateDbaasIntegration**](DbaasApi.md#updateDbaasIntegration) | **PUT** /dbaas-integration/{id} | Update a existing DBaaS integration |
| [**updateDbaasOpensearchAclConfig**](DbaasApi.md#updateDbaasOpensearchAclConfig) | **PUT** /dbaas-opensearch/{name}/acl-config | Create a DBaaS OpenSearch ACL configuration |
| [**updateDbaasPgConnectionPool**](DbaasApi.md#updateDbaasPgConnectionPool) | **PUT** /dbaas-postgres/{service-name}/connection-pool/{connection-pool-name} | Update a DBaaS PostgreSQL connection pool |
| [**updateDbaasPostgresAllowReplication**](DbaasApi.md#updateDbaasPostgresAllowReplication) | **PUT** /dbaas-postgres/{service-name}/user/{username}/allow-replication | Update access control for one service user |
| [**updateDbaasServiceGrafana**](DbaasApi.md#updateDbaasServiceGrafana) | **PUT** /dbaas-grafana/{name} | Update a DBaaS Grafana service |
| [**updateDbaasServiceKafka**](DbaasApi.md#updateDbaasServiceKafka) | **PUT** /dbaas-kafka/{name} | Update a DBaaS Kafka service |
| [**updateDbaasServiceMysql**](DbaasApi.md#updateDbaasServiceMysql) | **PUT** /dbaas-mysql/{name} | Update a DBaaS MySQL service |
| [**updateDbaasServiceOpensearch**](DbaasApi.md#updateDbaasServiceOpensearch) | **PUT** /dbaas-opensearch/{name} | Update a DBaaS OpenSearch service |
| [**updateDbaasServicePg**](DbaasApi.md#updateDbaasServicePg) | **PUT** /dbaas-postgres/{name} | Update a DBaaS PostgreSQL service |
| [**updateDbaasServiceRedis**](DbaasApi.md#updateDbaasServiceRedis) | **PUT** /dbaas-redis/{name} | Update a DBaaS Redis service |


<a id="createDbaasIntegration"></a>
# **createDbaasIntegration**
> Operation createDbaasIntegration(createDbaasIntegrationRequest)

Create a new DBaaS integration between two services

Create a new DBaaS integration between two services

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    CreateDbaasIntegrationRequest createDbaasIntegrationRequest = new CreateDbaasIntegrationRequest(); // CreateDbaasIntegrationRequest | 
    try {
      Operation result = apiInstance.createDbaasIntegration(createDbaasIntegrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDbaasIntegrationRequest** | [**CreateDbaasIntegrationRequest**](CreateDbaasIntegrationRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasKafkaSchemaRegistryAclConfig"></a>
# **createDbaasKafkaSchemaRegistryAclConfig**
> Operation createDbaasKafkaSchemaRegistryAclConfig(name, dbaasKafkaSchemaRegistryAclEntry)

Add a Kafka Schema Registry ACL entry

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    DbaasKafkaSchemaRegistryAclEntry dbaasKafkaSchemaRegistryAclEntry = new DbaasKafkaSchemaRegistryAclEntry(); // DbaasKafkaSchemaRegistryAclEntry | 
    try {
      Operation result = apiInstance.createDbaasKafkaSchemaRegistryAclConfig(name, dbaasKafkaSchemaRegistryAclEntry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasKafkaSchemaRegistryAclConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasKafkaSchemaRegistryAclEntry** | [**DbaasKafkaSchemaRegistryAclEntry**](DbaasKafkaSchemaRegistryAclEntry.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasKafkaTopicAclConfig"></a>
# **createDbaasKafkaTopicAclConfig**
> Operation createDbaasKafkaTopicAclConfig(name, dbaasKafkaTopicAclEntry)

Add a Kafka topic ACL entry

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    DbaasKafkaTopicAclEntry dbaasKafkaTopicAclEntry = new DbaasKafkaTopicAclEntry(); // DbaasKafkaTopicAclEntry | 
    try {
      Operation result = apiInstance.createDbaasKafkaTopicAclConfig(name, dbaasKafkaTopicAclEntry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasKafkaTopicAclConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasKafkaTopicAclEntry** | [**DbaasKafkaTopicAclEntry**](DbaasKafkaTopicAclEntry.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasKafkaUser"></a>
# **createDbaasKafkaUser**
> Operation createDbaasKafkaUser(serviceName, createDbaasKafkaUserRequest)

Create a DBaaS Kafka user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest = new CreateDbaasKafkaUserRequest(); // CreateDbaasKafkaUserRequest | 
    try {
      Operation result = apiInstance.createDbaasKafkaUser(serviceName, createDbaasKafkaUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasKafkaUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasKafkaUserRequest** | [**CreateDbaasKafkaUserRequest**](CreateDbaasKafkaUserRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasMysqlDatabase"></a>
# **createDbaasMysqlDatabase**
> Operation createDbaasMysqlDatabase(serviceName, createDbaasMysqlDatabaseRequest)

Create a DBaaS MySQL database

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    CreateDbaasMysqlDatabaseRequest createDbaasMysqlDatabaseRequest = new CreateDbaasMysqlDatabaseRequest(); // CreateDbaasMysqlDatabaseRequest | 
    try {
      Operation result = apiInstance.createDbaasMysqlDatabase(serviceName, createDbaasMysqlDatabaseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasMysqlDatabase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasMysqlDatabaseRequest** | [**CreateDbaasMysqlDatabaseRequest**](CreateDbaasMysqlDatabaseRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasMysqlUser"></a>
# **createDbaasMysqlUser**
> Operation createDbaasMysqlUser(serviceName, createDbaasMysqlUserRequest)

Create a DBaaS MySQL user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    CreateDbaasMysqlUserRequest createDbaasMysqlUserRequest = new CreateDbaasMysqlUserRequest(); // CreateDbaasMysqlUserRequest | 
    try {
      Operation result = apiInstance.createDbaasMysqlUser(serviceName, createDbaasMysqlUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasMysqlUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasMysqlUserRequest** | [**CreateDbaasMysqlUserRequest**](CreateDbaasMysqlUserRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasOpensearchUser"></a>
# **createDbaasOpensearchUser**
> Operation createDbaasOpensearchUser(serviceName, createDbaasKafkaUserRequest)

Create a DBaaS OpenSearch user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest = new CreateDbaasKafkaUserRequest(); // CreateDbaasKafkaUserRequest | 
    try {
      Operation result = apiInstance.createDbaasOpensearchUser(serviceName, createDbaasKafkaUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasOpensearchUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasKafkaUserRequest** | [**CreateDbaasKafkaUserRequest**](CreateDbaasKafkaUserRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasPgConnectionPool"></a>
# **createDbaasPgConnectionPool**
> Operation createDbaasPgConnectionPool(serviceName, createDbaasPgConnectionPoolRequest)

Create a DBaaS PostgreSQL connection pool



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    CreateDbaasPgConnectionPoolRequest createDbaasPgConnectionPoolRequest = new CreateDbaasPgConnectionPoolRequest(); // CreateDbaasPgConnectionPoolRequest | 
    try {
      Operation result = apiInstance.createDbaasPgConnectionPool(serviceName, createDbaasPgConnectionPoolRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasPgConnectionPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasPgConnectionPoolRequest** | [**CreateDbaasPgConnectionPoolRequest**](CreateDbaasPgConnectionPoolRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasPgDatabase"></a>
# **createDbaasPgDatabase**
> Operation createDbaasPgDatabase(serviceName, createDbaasPgDatabaseRequest)

Create a DBaaS Postgres database

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    CreateDbaasPgDatabaseRequest createDbaasPgDatabaseRequest = new CreateDbaasPgDatabaseRequest(); // CreateDbaasPgDatabaseRequest | 
    try {
      Operation result = apiInstance.createDbaasPgDatabase(serviceName, createDbaasPgDatabaseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasPgDatabase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasPgDatabaseRequest** | [**CreateDbaasPgDatabaseRequest**](CreateDbaasPgDatabaseRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasPgUpgradeCheck"></a>
# **createDbaasPgUpgradeCheck**
> DbaasTask createDbaasPgUpgradeCheck(service, createDbaasPgUpgradeCheckRequest)



Check whether you can upgrade Postgres service to a newer version

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String service = "service_example"; // String | 
    CreateDbaasPgUpgradeCheckRequest createDbaasPgUpgradeCheckRequest = new CreateDbaasPgUpgradeCheckRequest(); // CreateDbaasPgUpgradeCheckRequest | 
    try {
      DbaasTask result = apiInstance.createDbaasPgUpgradeCheck(service, createDbaasPgUpgradeCheckRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasPgUpgradeCheck");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **createDbaasPgUpgradeCheckRequest** | [**CreateDbaasPgUpgradeCheckRequest**](CreateDbaasPgUpgradeCheckRequest.md)|  | |

### Return type

[**DbaasTask**](DbaasTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasPostgresUser"></a>
# **createDbaasPostgresUser**
> Operation createDbaasPostgresUser(serviceName, createDbaasPostgresUserRequest)

Create a DBaaS Postgres user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    CreateDbaasPostgresUserRequest createDbaasPostgresUserRequest = new CreateDbaasPostgresUserRequest(); // CreateDbaasPostgresUserRequest | 
    try {
      Operation result = apiInstance.createDbaasPostgresUser(serviceName, createDbaasPostgresUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasPostgresUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasPostgresUserRequest** | [**CreateDbaasPostgresUserRequest**](CreateDbaasPostgresUserRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasServiceGrafana"></a>
# **createDbaasServiceGrafana**
> Operation createDbaasServiceGrafana(name, createDbaasServiceGrafanaRequest)



Create a DBaaS Grafana service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    CreateDbaasServiceGrafanaRequest createDbaasServiceGrafanaRequest = new CreateDbaasServiceGrafanaRequest(); // CreateDbaasServiceGrafanaRequest | 
    try {
      Operation result = apiInstance.createDbaasServiceGrafana(name, createDbaasServiceGrafanaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasServiceGrafana");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceGrafanaRequest** | [**CreateDbaasServiceGrafanaRequest**](CreateDbaasServiceGrafanaRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasServiceKafka"></a>
# **createDbaasServiceKafka**
> Operation createDbaasServiceKafka(name, createDbaasServiceKafkaRequest)

Create a DBaaS Kafka service

Create a DBaaS Kafka service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    CreateDbaasServiceKafkaRequest createDbaasServiceKafkaRequest = new CreateDbaasServiceKafkaRequest(); // CreateDbaasServiceKafkaRequest | 
    try {
      Operation result = apiInstance.createDbaasServiceKafka(name, createDbaasServiceKafkaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasServiceKafka");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceKafkaRequest** | [**CreateDbaasServiceKafkaRequest**](CreateDbaasServiceKafkaRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasServiceMysql"></a>
# **createDbaasServiceMysql**
> Operation createDbaasServiceMysql(name, createDbaasServiceMysqlRequest)

Create a DBaaS MySQL service

Create a DBaaS MySQL service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    CreateDbaasServiceMysqlRequest createDbaasServiceMysqlRequest = new CreateDbaasServiceMysqlRequest(); // CreateDbaasServiceMysqlRequest | 
    try {
      Operation result = apiInstance.createDbaasServiceMysql(name, createDbaasServiceMysqlRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasServiceMysql");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceMysqlRequest** | [**CreateDbaasServiceMysqlRequest**](CreateDbaasServiceMysqlRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasServiceOpensearch"></a>
# **createDbaasServiceOpensearch**
> Operation createDbaasServiceOpensearch(name, createDbaasServiceOpensearchRequest)

Create a DBaaS OpenSearch service

Create a DBaaS OpenSearch service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    CreateDbaasServiceOpensearchRequest createDbaasServiceOpensearchRequest = new CreateDbaasServiceOpensearchRequest(); // CreateDbaasServiceOpensearchRequest | 
    try {
      Operation result = apiInstance.createDbaasServiceOpensearch(name, createDbaasServiceOpensearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasServiceOpensearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceOpensearchRequest** | [**CreateDbaasServiceOpensearchRequest**](CreateDbaasServiceOpensearchRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasServicePg"></a>
# **createDbaasServicePg**
> Operation createDbaasServicePg(name, createDbaasServicePgRequest)

Create a DBaaS PostgreSQL service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    CreateDbaasServicePgRequest createDbaasServicePgRequest = new CreateDbaasServicePgRequest(); // CreateDbaasServicePgRequest | 
    try {
      Operation result = apiInstance.createDbaasServicePg(name, createDbaasServicePgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasServicePg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServicePgRequest** | [**CreateDbaasServicePgRequest**](CreateDbaasServicePgRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasServiceRedis"></a>
# **createDbaasServiceRedis**
> Operation createDbaasServiceRedis(name, createDbaasServiceRedisRequest)

Create a DBaaS Redis service

Create a DBaaS Redis service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    CreateDbaasServiceRedisRequest createDbaasServiceRedisRequest = new CreateDbaasServiceRedisRequest(); // CreateDbaasServiceRedisRequest | 
    try {
      Operation result = apiInstance.createDbaasServiceRedis(name, createDbaasServiceRedisRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasServiceRedis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceRedisRequest** | [**CreateDbaasServiceRedisRequest**](CreateDbaasServiceRedisRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDbaasTaskMigrationCheck"></a>
# **createDbaasTaskMigrationCheck**
> Operation createDbaasTaskMigrationCheck(service, createDbaasTaskMigrationCheckRequest)



Create a DBaaS task to check migration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String service = "service_example"; // String | 
    CreateDbaasTaskMigrationCheckRequest createDbaasTaskMigrationCheckRequest = new CreateDbaasTaskMigrationCheckRequest(); // CreateDbaasTaskMigrationCheckRequest | 
    try {
      Operation result = apiInstance.createDbaasTaskMigrationCheck(service, createDbaasTaskMigrationCheckRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#createDbaasTaskMigrationCheck");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **createDbaasTaskMigrationCheckRequest** | [**CreateDbaasTaskMigrationCheckRequest**](CreateDbaasTaskMigrationCheckRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasIntegration"></a>
# **deleteDbaasIntegration**
> Operation deleteDbaasIntegration(id)

Delete a DBaaS Integration

Delete a DBaaS Integration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Operation result = apiInstance.deleteDbaasIntegration(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasKafkaSchemaRegistryAclConfig"></a>
# **deleteDbaasKafkaSchemaRegistryAclConfig**
> Operation deleteDbaasKafkaSchemaRegistryAclConfig(name, aclId)

Delete a Kafka ACL entry

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    String aclId = "aclId_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasKafkaSchemaRegistryAclConfig(name, aclId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasKafkaSchemaRegistryAclConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **aclId** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasKafkaTopicAclConfig"></a>
# **deleteDbaasKafkaTopicAclConfig**
> Operation deleteDbaasKafkaTopicAclConfig(name, aclId)

Delete a Kafka ACL entry

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    String aclId = "aclId_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasKafkaTopicAclConfig(name, aclId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasKafkaTopicAclConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **aclId** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasKafkaUser"></a>
# **deleteDbaasKafkaUser**
> Operation deleteDbaasKafkaUser(serviceName, username)

Delete a DBaaS kafka user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String username = "username_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasKafkaUser(serviceName, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasKafkaUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasMysqlDatabase"></a>
# **deleteDbaasMysqlDatabase**
> Operation deleteDbaasMysqlDatabase(serviceName, databaseName)

Delete a DBaaS MySQL database

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String databaseName = "databaseName_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasMysqlDatabase(serviceName, databaseName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasMysqlDatabase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **databaseName** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasMysqlUser"></a>
# **deleteDbaasMysqlUser**
> Operation deleteDbaasMysqlUser(serviceName, username)

Delete a DBaaS MySQL user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String username = "username_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasMysqlUser(serviceName, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasMysqlUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasOpensearchUser"></a>
# **deleteDbaasOpensearchUser**
> Operation deleteDbaasOpensearchUser(serviceName, username)

Delete a DBaaS OpenSearch user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String username = "username_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasOpensearchUser(serviceName, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasOpensearchUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasPgConnectionPool"></a>
# **deleteDbaasPgConnectionPool**
> Operation deleteDbaasPgConnectionPool(serviceName, connectionPoolName)

Delete a DBaaS PostgreSQL connection pool



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String connectionPoolName = "connectionPoolName_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasPgConnectionPool(serviceName, connectionPoolName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasPgConnectionPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **connectionPoolName** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasPgDatabase"></a>
# **deleteDbaasPgDatabase**
> Operation deleteDbaasPgDatabase(serviceName, databaseName)

Delete a DBaaS Postgres database

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String databaseName = "databaseName_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasPgDatabase(serviceName, databaseName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasPgDatabase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **databaseName** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasPostgresUser"></a>
# **deleteDbaasPostgresUser**
> Operation deleteDbaasPostgresUser(serviceName, username)

Delete a DBaaS Postgres user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String username = "username_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasPostgresUser(serviceName, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasPostgresUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasService"></a>
# **deleteDbaasService**
> Operation deleteDbaasService(name)

Delete a DBaaS service

Delete a DBaaS service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasService(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasServiceGrafana"></a>
# **deleteDbaasServiceGrafana**
> Operation deleteDbaasServiceGrafana(name)

Delete a Grafana service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasServiceGrafana(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasServiceGrafana");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasServiceKafka"></a>
# **deleteDbaasServiceKafka**
> Operation deleteDbaasServiceKafka(name)

Delete a Kafka service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasServiceKafka(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasServiceKafka");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasServiceMysql"></a>
# **deleteDbaasServiceMysql**
> Operation deleteDbaasServiceMysql(name)

Delete a MySQL service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasServiceMysql(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasServiceMysql");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasServiceOpensearch"></a>
# **deleteDbaasServiceOpensearch**
> Operation deleteDbaasServiceOpensearch(name)

Delete a OpenSearch service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasServiceOpensearch(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasServiceOpensearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasServicePg"></a>
# **deleteDbaasServicePg**
> Operation deleteDbaasServicePg(name)

Delete a Postgres service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasServicePg(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasServicePg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="deleteDbaasServiceRedis"></a>
# **deleteDbaasServiceRedis**
> Operation deleteDbaasServiceRedis(name)

Delete a Redis service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.deleteDbaasServiceRedis(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#deleteDbaasServiceRedis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasCaCertificate"></a>
# **getDbaasCaCertificate**
> GetDbaasCaCertificate200Response getDbaasCaCertificate()

Get DBaaS CA Certificate

Returns a CA Certificate required to reach a DBaaS service through a TLS-protected connection.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    try {
      GetDbaasCaCertificate200Response result = apiInstance.getDbaasCaCertificate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasCaCertificate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDbaasCaCertificate200Response**](GetDbaasCaCertificate200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasIntegration"></a>
# **getDbaasIntegration**
> DbaasIntegration getDbaasIntegration(id)

Get a DBaaS Integration

Get a DBaaS Integration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DbaasIntegration result = apiInstance.getDbaasIntegration(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**DbaasIntegration**](DbaasIntegration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasKafkaAclConfig"></a>
# **getDbaasKafkaAclConfig**
> DbaasKafkaAcls getDbaasKafkaAclConfig(name)

Get DBaaS kafka ACL configuration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      DbaasKafkaAcls result = apiInstance.getDbaasKafkaAclConfig(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasKafkaAclConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasKafkaAcls**](DbaasKafkaAcls.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasMigrationStatus"></a>
# **getDbaasMigrationStatus**
> DbaasMigrationStatus getDbaasMigrationStatus(name)

Get a DBaaS migration status

Get a DBaaS migration status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      DbaasMigrationStatus result = apiInstance.getDbaasMigrationStatus(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasMigrationStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasMigrationStatus**](DbaasMigrationStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasOpensearchAclConfig"></a>
# **getDbaasOpensearchAclConfig**
> DbaasOpensearchAclConfig getDbaasOpensearchAclConfig(name)

Get DBaaS OpenSearch ACL configuration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      DbaasOpensearchAclConfig result = apiInstance.getDbaasOpensearchAclConfig(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasOpensearchAclConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasOpensearchAclConfig**](DbaasOpensearchAclConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasServiceGrafana"></a>
# **getDbaasServiceGrafana**
> DbaasServiceGrafana getDbaasServiceGrafana(name)

Get a DBaaS Grafana service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      DbaasServiceGrafana result = apiInstance.getDbaasServiceGrafana(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasServiceGrafana");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServiceGrafana**](DbaasServiceGrafana.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasServiceKafka"></a>
# **getDbaasServiceKafka**
> DbaasServiceKafka getDbaasServiceKafka(name)

Get a DBaaS Kafka service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      DbaasServiceKafka result = apiInstance.getDbaasServiceKafka(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasServiceKafka");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServiceKafka**](DbaasServiceKafka.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasServiceLogs"></a>
# **getDbaasServiceLogs**
> DbaasServiceLogs getDbaasServiceLogs(serviceName, getDbaasServiceLogsRequest)

Get logs of DBaaS service

Get logs of DBaaS service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    GetDbaasServiceLogsRequest getDbaasServiceLogsRequest = new GetDbaasServiceLogsRequest(); // GetDbaasServiceLogsRequest | 
    try {
      DbaasServiceLogs result = apiInstance.getDbaasServiceLogs(serviceName, getDbaasServiceLogsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasServiceLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **getDbaasServiceLogsRequest** | [**GetDbaasServiceLogsRequest**](GetDbaasServiceLogsRequest.md)|  | |

### Return type

[**DbaasServiceLogs**](DbaasServiceLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasServiceMetrics"></a>
# **getDbaasServiceMetrics**
> GetDbaasServiceMetrics200Response getDbaasServiceMetrics(serviceName, getDbaasServiceMetricsRequest)

Get metrics of DBaaS service

Get metrics of DBaaS service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    GetDbaasServiceMetricsRequest getDbaasServiceMetricsRequest = new GetDbaasServiceMetricsRequest(); // GetDbaasServiceMetricsRequest | 
    try {
      GetDbaasServiceMetrics200Response result = apiInstance.getDbaasServiceMetrics(serviceName, getDbaasServiceMetricsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasServiceMetrics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **getDbaasServiceMetricsRequest** | [**GetDbaasServiceMetricsRequest**](GetDbaasServiceMetricsRequest.md)|  | |

### Return type

[**GetDbaasServiceMetrics200Response**](GetDbaasServiceMetrics200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasServiceMysql"></a>
# **getDbaasServiceMysql**
> DbaasServiceMysql getDbaasServiceMysql(name)

Get a DBaaS MySQL service

Get a DBaaS MySQL service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      DbaasServiceMysql result = apiInstance.getDbaasServiceMysql(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasServiceMysql");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServiceMysql**](DbaasServiceMysql.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasServiceOpensearch"></a>
# **getDbaasServiceOpensearch**
> DbaasServiceOpensearch getDbaasServiceOpensearch(name)

Get a DBaaS OpenSearch service

Get a DBaaS OpenSearch service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      DbaasServiceOpensearch result = apiInstance.getDbaasServiceOpensearch(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasServiceOpensearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServiceOpensearch**](DbaasServiceOpensearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasServicePg"></a>
# **getDbaasServicePg**
> DbaasServicePg getDbaasServicePg(name)

Get a DBaaS PostgreSQL service

Get a DBaaS PostgreSQL service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      DbaasServicePg result = apiInstance.getDbaasServicePg(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasServicePg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServicePg**](DbaasServicePg.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasServiceRedis"></a>
# **getDbaasServiceRedis**
> DbaasServiceRedis getDbaasServiceRedis(name)

Get a DBaaS Redis service

Get a DBaaS Redis service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      DbaasServiceRedis result = apiInstance.getDbaasServiceRedis(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasServiceRedis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServiceRedis**](DbaasServiceRedis.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasServiceType"></a>
# **getDbaasServiceType**
> DbaasServiceType getDbaasServiceType(serviceTypeName)

Get a DBaaS service type

Get a DBaaS service type

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceTypeName = "serviceTypeName_example"; // String | 
    try {
      DbaasServiceType result = apiInstance.getDbaasServiceType(serviceTypeName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasServiceType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceTypeName** | **String**|  | |

### Return type

[**DbaasServiceType**](DbaasServiceType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasSettingsGrafana"></a>
# **getDbaasSettingsGrafana**
> GetDbaasSettingsGrafana200Response getDbaasSettingsGrafana()

Get DBaaS Grafana settings

Get DBaaS Grafana settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    try {
      GetDbaasSettingsGrafana200Response result = apiInstance.getDbaasSettingsGrafana();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasSettingsGrafana");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsGrafana200Response**](GetDbaasSettingsGrafana200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasSettingsKafka"></a>
# **getDbaasSettingsKafka**
> GetDbaasSettingsKafka200Response getDbaasSettingsKafka()

Get DBaaS Kafka settings

Get DBaaS Kafka settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    try {
      GetDbaasSettingsKafka200Response result = apiInstance.getDbaasSettingsKafka();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasSettingsKafka");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsKafka200Response**](GetDbaasSettingsKafka200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasSettingsMysql"></a>
# **getDbaasSettingsMysql**
> GetDbaasSettingsMysql200Response getDbaasSettingsMysql()

Get DBaaS MySQL settings

Get DBaaS MySQL settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    try {
      GetDbaasSettingsMysql200Response result = apiInstance.getDbaasSettingsMysql();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasSettingsMysql");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsMysql200Response**](GetDbaasSettingsMysql200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasSettingsOpensearch"></a>
# **getDbaasSettingsOpensearch**
> GetDbaasSettingsOpensearch200Response getDbaasSettingsOpensearch()

Get DBaaS OpenSearch settings

Get DBaaS OpenSearch settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    try {
      GetDbaasSettingsOpensearch200Response result = apiInstance.getDbaasSettingsOpensearch();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasSettingsOpensearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsOpensearch200Response**](GetDbaasSettingsOpensearch200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasSettingsPg"></a>
# **getDbaasSettingsPg**
> GetDbaasSettingsPg200Response getDbaasSettingsPg()

Get DBaaS PostgreSQL settings

Get DBaaS PostgreSQL settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    try {
      GetDbaasSettingsPg200Response result = apiInstance.getDbaasSettingsPg();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasSettingsPg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsPg200Response**](GetDbaasSettingsPg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasSettingsRedis"></a>
# **getDbaasSettingsRedis**
> GetDbaasSettingsRedis200Response getDbaasSettingsRedis()

Get DBaaS Redis settings

Returns the default settings for Redis.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    try {
      GetDbaasSettingsRedis200Response result = apiInstance.getDbaasSettingsRedis();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasSettingsRedis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsRedis200Response**](GetDbaasSettingsRedis200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDbaasTask"></a>
# **getDbaasTask**
> DbaasTask getDbaasTask(service, id)

Get a DBaaS task

Get a DBaaS task

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String service = "service_example"; // String | 
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DbaasTask result = apiInstance.getDbaasTask(service, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#getDbaasTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **id** | **UUID**|  | |

### Return type

[**DbaasTask**](DbaasTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="listDbaasIntegrationSettings"></a>
# **listDbaasIntegrationSettings**
> ListDbaasIntegrationSettings200Response listDbaasIntegrationSettings(integrationType, sourceType, destType)

Get DBaaS integration settings

Get DBaaS integration settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String integrationType = "integrationType_example"; // String | 
    String sourceType = "sourceType_example"; // String | 
    String destType = "destType_example"; // String | 
    try {
      ListDbaasIntegrationSettings200Response result = apiInstance.listDbaasIntegrationSettings(integrationType, sourceType, destType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#listDbaasIntegrationSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **String**|  | |
| **sourceType** | **String**|  | |
| **destType** | **String**|  | |

### Return type

[**ListDbaasIntegrationSettings200Response**](ListDbaasIntegrationSettings200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="listDbaasIntegrationTypes"></a>
# **listDbaasIntegrationTypes**
> ListDbaasIntegrationTypes200Response listDbaasIntegrationTypes()

Get DBaaS integration types

Get DBaaS integration types

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    try {
      ListDbaasIntegrationTypes200Response result = apiInstance.listDbaasIntegrationTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#listDbaasIntegrationTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListDbaasIntegrationTypes200Response**](ListDbaasIntegrationTypes200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="listDbaasServiceTypes"></a>
# **listDbaasServiceTypes**
> ListDbaasServiceTypes200Response listDbaasServiceTypes()

DBaaS Service Types

List available service types for DBaaS

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    try {
      ListDbaasServiceTypes200Response result = apiInstance.listDbaasServiceTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#listDbaasServiceTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListDbaasServiceTypes200Response**](ListDbaasServiceTypes200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="listDbaasServices"></a>
# **listDbaasServices**
> ListDbaasServices200Response listDbaasServices()

List DBaaS services

List DBaaS services

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    try {
      ListDbaasServices200Response result = apiInstance.listDbaasServices();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#listDbaasServices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListDbaasServices200Response**](ListDbaasServices200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="resetDbaasKafkaUserPassword"></a>
# **resetDbaasKafkaUserPassword**
> Operation resetDbaasKafkaUserPassword(serviceName, username, resetDbaasOpensearchUserPasswordRequest)

Reset the credentials of a DBaaS Kafka user

If no password is provided one will be generated automatically.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String username = "username_example"; // String | 
    ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest = new ResetDbaasOpensearchUserPasswordRequest(); // ResetDbaasOpensearchUserPasswordRequest | 
    try {
      Operation result = apiInstance.resetDbaasKafkaUserPassword(serviceName, username, resetDbaasOpensearchUserPasswordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#resetDbaasKafkaUserPassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasOpensearchUserPasswordRequest** | [**ResetDbaasOpensearchUserPasswordRequest**](ResetDbaasOpensearchUserPasswordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="resetDbaasMysqlUserPassword"></a>
# **resetDbaasMysqlUserPassword**
> Operation resetDbaasMysqlUserPassword(serviceName, username, resetDbaasMysqlUserPasswordRequest)

Reset the credentials of a DBaaS mysql user

If no password is provided one will be generated automatically.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String username = "username_example"; // String | 
    ResetDbaasMysqlUserPasswordRequest resetDbaasMysqlUserPasswordRequest = new ResetDbaasMysqlUserPasswordRequest(); // ResetDbaasMysqlUserPasswordRequest | 
    try {
      Operation result = apiInstance.resetDbaasMysqlUserPassword(serviceName, username, resetDbaasMysqlUserPasswordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#resetDbaasMysqlUserPassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasMysqlUserPasswordRequest** | [**ResetDbaasMysqlUserPasswordRequest**](ResetDbaasMysqlUserPasswordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="resetDbaasOpensearchUserPassword"></a>
# **resetDbaasOpensearchUserPassword**
> Operation resetDbaasOpensearchUserPassword(serviceName, username, resetDbaasOpensearchUserPasswordRequest)

Reset the credentials of a DBaaS OpenSearch user

If no password is provided one will be generated automatically.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String username = "username_example"; // String | 
    ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest = new ResetDbaasOpensearchUserPasswordRequest(); // ResetDbaasOpensearchUserPasswordRequest | 
    try {
      Operation result = apiInstance.resetDbaasOpensearchUserPassword(serviceName, username, resetDbaasOpensearchUserPasswordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#resetDbaasOpensearchUserPassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasOpensearchUserPasswordRequest** | [**ResetDbaasOpensearchUserPasswordRequest**](ResetDbaasOpensearchUserPasswordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="resetDbaasPostgresUserPassword"></a>
# **resetDbaasPostgresUserPassword**
> Operation resetDbaasPostgresUserPassword(serviceName, username, resetDbaasOpensearchUserPasswordRequest)

Reset the credentials of a DBaaS Postgres user

If no password is provided one will be generated automatically.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String username = "username_example"; // String | 
    ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest = new ResetDbaasOpensearchUserPasswordRequest(); // ResetDbaasOpensearchUserPasswordRequest | 
    try {
      Operation result = apiInstance.resetDbaasPostgresUserPassword(serviceName, username, resetDbaasOpensearchUserPasswordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#resetDbaasPostgresUserPassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasOpensearchUserPasswordRequest** | [**ResetDbaasOpensearchUserPasswordRequest**](ResetDbaasOpensearchUserPasswordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="startDbaasGrafanaMaintenance"></a>
# **startDbaasGrafanaMaintenance**
> Operation startDbaasGrafanaMaintenance(name)

Initiate Grafana maintenance update

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.startDbaasGrafanaMaintenance(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#startDbaasGrafanaMaintenance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="startDbaasKafkaMaintenance"></a>
# **startDbaasKafkaMaintenance**
> Operation startDbaasKafkaMaintenance(name)

Initiate Kafka maintenance update

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.startDbaasKafkaMaintenance(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#startDbaasKafkaMaintenance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="startDbaasMysqlMaintenance"></a>
# **startDbaasMysqlMaintenance**
> Operation startDbaasMysqlMaintenance(name)

Initiate MySQL maintenance update

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.startDbaasMysqlMaintenance(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#startDbaasMysqlMaintenance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="startDbaasOpensearchMaintenance"></a>
# **startDbaasOpensearchMaintenance**
> Operation startDbaasOpensearchMaintenance(name)

Initiate OpenSearch maintenance update

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.startDbaasOpensearchMaintenance(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#startDbaasOpensearchMaintenance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="startDbaasPgMaintenance"></a>
# **startDbaasPgMaintenance**
> Operation startDbaasPgMaintenance(name)

Initiate PostgreSQL maintenance update

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.startDbaasPgMaintenance(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#startDbaasPgMaintenance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="startDbaasRedisMaintenance"></a>
# **startDbaasRedisMaintenance**
> Operation startDbaasRedisMaintenance(name)

Initiate Redis maintenance update

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.startDbaasRedisMaintenance(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#startDbaasRedisMaintenance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="stopDbaasMysqlMigration"></a>
# **stopDbaasMysqlMigration**
> Operation stopDbaasMysqlMigration(name)

Stop a DBaaS MySQL migration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.stopDbaasMysqlMigration(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#stopDbaasMysqlMigration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="stopDbaasPgMigration"></a>
# **stopDbaasPgMigration**
> Operation stopDbaasPgMigration(name)

Stop a DBaaS PostgreSQL migration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.stopDbaasPgMigration(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#stopDbaasPgMigration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="stopDbaasRedisMigration"></a>
# **stopDbaasRedisMigration**
> Operation stopDbaasRedisMigration(name)

Stop a DBaaS Redis migration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.stopDbaasRedisMigration(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#stopDbaasRedisMigration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateDbaasIntegration"></a>
# **updateDbaasIntegration**
> Operation updateDbaasIntegration(id, updateDbaasIntegrationRequest)

Update a existing DBaaS integration

Update a existing DBaaS integration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UpdateDbaasIntegrationRequest updateDbaasIntegrationRequest = new UpdateDbaasIntegrationRequest(); // UpdateDbaasIntegrationRequest | 
    try {
      Operation result = apiInstance.updateDbaasIntegration(id, updateDbaasIntegrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#updateDbaasIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateDbaasIntegrationRequest** | [**UpdateDbaasIntegrationRequest**](UpdateDbaasIntegrationRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateDbaasOpensearchAclConfig"></a>
# **updateDbaasOpensearchAclConfig**
> Operation updateDbaasOpensearchAclConfig(name, dbaasOpensearchAclConfig)

Create a DBaaS OpenSearch ACL configuration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    DbaasOpensearchAclConfig dbaasOpensearchAclConfig = new DbaasOpensearchAclConfig(); // DbaasOpensearchAclConfig | 
    try {
      Operation result = apiInstance.updateDbaasOpensearchAclConfig(name, dbaasOpensearchAclConfig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#updateDbaasOpensearchAclConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasOpensearchAclConfig** | [**DbaasOpensearchAclConfig**](DbaasOpensearchAclConfig.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateDbaasPgConnectionPool"></a>
# **updateDbaasPgConnectionPool**
> Operation updateDbaasPgConnectionPool(serviceName, connectionPoolName, updateDbaasPgConnectionPoolRequest)

Update a DBaaS PostgreSQL connection pool



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String connectionPoolName = "connectionPoolName_example"; // String | 
    UpdateDbaasPgConnectionPoolRequest updateDbaasPgConnectionPoolRequest = new UpdateDbaasPgConnectionPoolRequest(); // UpdateDbaasPgConnectionPoolRequest | 
    try {
      Operation result = apiInstance.updateDbaasPgConnectionPool(serviceName, connectionPoolName, updateDbaasPgConnectionPoolRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#updateDbaasPgConnectionPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **connectionPoolName** | **String**|  | |
| **updateDbaasPgConnectionPoolRequest** | [**UpdateDbaasPgConnectionPoolRequest**](UpdateDbaasPgConnectionPoolRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateDbaasPostgresAllowReplication"></a>
# **updateDbaasPostgresAllowReplication**
> DbaasPostgresUsers updateDbaasPostgresAllowReplication(serviceName, username, updateDbaasPostgresAllowReplicationRequest)

Update access control for one service user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String serviceName = "serviceName_example"; // String | 
    String username = "username_example"; // String | 
    UpdateDbaasPostgresAllowReplicationRequest updateDbaasPostgresAllowReplicationRequest = new UpdateDbaasPostgresAllowReplicationRequest(); // UpdateDbaasPostgresAllowReplicationRequest | 
    try {
      DbaasPostgresUsers result = apiInstance.updateDbaasPostgresAllowReplication(serviceName, username, updateDbaasPostgresAllowReplicationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#updateDbaasPostgresAllowReplication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **updateDbaasPostgresAllowReplicationRequest** | [**UpdateDbaasPostgresAllowReplicationRequest**](UpdateDbaasPostgresAllowReplicationRequest.md)|  | |

### Return type

[**DbaasPostgresUsers**](DbaasPostgresUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateDbaasServiceGrafana"></a>
# **updateDbaasServiceGrafana**
> Operation updateDbaasServiceGrafana(name, updateDbaasServiceGrafanaRequest)

Update a DBaaS Grafana service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    UpdateDbaasServiceGrafanaRequest updateDbaasServiceGrafanaRequest = new UpdateDbaasServiceGrafanaRequest(); // UpdateDbaasServiceGrafanaRequest | 
    try {
      Operation result = apiInstance.updateDbaasServiceGrafana(name, updateDbaasServiceGrafanaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#updateDbaasServiceGrafana");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceGrafanaRequest** | [**UpdateDbaasServiceGrafanaRequest**](UpdateDbaasServiceGrafanaRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateDbaasServiceKafka"></a>
# **updateDbaasServiceKafka**
> Operation updateDbaasServiceKafka(name, updateDbaasServiceKafkaRequest)

Update a DBaaS Kafka service

Update a DBaaS Kafka service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    UpdateDbaasServiceKafkaRequest updateDbaasServiceKafkaRequest = new UpdateDbaasServiceKafkaRequest(); // UpdateDbaasServiceKafkaRequest | 
    try {
      Operation result = apiInstance.updateDbaasServiceKafka(name, updateDbaasServiceKafkaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#updateDbaasServiceKafka");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceKafkaRequest** | [**UpdateDbaasServiceKafkaRequest**](UpdateDbaasServiceKafkaRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateDbaasServiceMysql"></a>
# **updateDbaasServiceMysql**
> Operation updateDbaasServiceMysql(name, updateDbaasServiceMysqlRequest)

Update a DBaaS MySQL service

Update a DBaaS MySQL service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    UpdateDbaasServiceMysqlRequest updateDbaasServiceMysqlRequest = new UpdateDbaasServiceMysqlRequest(); // UpdateDbaasServiceMysqlRequest | 
    try {
      Operation result = apiInstance.updateDbaasServiceMysql(name, updateDbaasServiceMysqlRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#updateDbaasServiceMysql");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceMysqlRequest** | [**UpdateDbaasServiceMysqlRequest**](UpdateDbaasServiceMysqlRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateDbaasServiceOpensearch"></a>
# **updateDbaasServiceOpensearch**
> Operation updateDbaasServiceOpensearch(name, updateDbaasServiceOpensearchRequest)

Update a DBaaS OpenSearch service

Update a DBaaS OpenSearch service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    UpdateDbaasServiceOpensearchRequest updateDbaasServiceOpensearchRequest = new UpdateDbaasServiceOpensearchRequest(); // UpdateDbaasServiceOpensearchRequest | 
    try {
      Operation result = apiInstance.updateDbaasServiceOpensearch(name, updateDbaasServiceOpensearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#updateDbaasServiceOpensearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceOpensearchRequest** | [**UpdateDbaasServiceOpensearchRequest**](UpdateDbaasServiceOpensearchRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateDbaasServicePg"></a>
# **updateDbaasServicePg**
> Operation updateDbaasServicePg(name, updateDbaasServicePgRequest)

Update a DBaaS PostgreSQL service

Update a DBaaS PostgreSQL service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    UpdateDbaasServicePgRequest updateDbaasServicePgRequest = new UpdateDbaasServicePgRequest(); // UpdateDbaasServicePgRequest | 
    try {
      Operation result = apiInstance.updateDbaasServicePg(name, updateDbaasServicePgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#updateDbaasServicePg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServicePgRequest** | [**UpdateDbaasServicePgRequest**](UpdateDbaasServicePgRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateDbaasServiceRedis"></a>
# **updateDbaasServiceRedis**
> Operation updateDbaasServiceRedis(name, updateDbaasServiceRedisRequest)

Update a DBaaS Redis service

Update a DBaaS Redis service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DbaasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DbaasApi apiInstance = new DbaasApi(defaultClient);
    String name = "name_example"; // String | 
    UpdateDbaasServiceRedisRequest updateDbaasServiceRedisRequest = new UpdateDbaasServiceRedisRequest(); // UpdateDbaasServiceRedisRequest | 
    try {
      Operation result = apiInstance.updateDbaasServiceRedis(name, updateDbaasServiceRedisRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbaasApi#updateDbaasServiceRedis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceRedisRequest** | [**UpdateDbaasServiceRedisRequest**](UpdateDbaasServiceRedisRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

