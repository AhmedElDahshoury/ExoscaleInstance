

# LoadBalancerService

Load Balancer Service

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Load Balancer Service description |  [optional] |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Network traffic protocol |  [optional] |
|**name** | **String** | Load Balancer Service name |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Load Balancer Service state |  [optional] [readonly] |
|**targetPort** | **Long** | Port on which the network traffic will be forwarded to on the receiving instance |  [optional] |
|**port** | **Long** | Port exposed on the Load Balancer&#39;s public IP |  [optional] |
|**instancePool** | [**InstancePool**](InstancePool.md) |  |  [optional] |
|**strategy** | [**StrategyEnum**](#StrategyEnum) | Load balancing strategy |  [optional] |
|**healthcheck** | [**LoadBalancerServiceHealthcheck**](LoadBalancerServiceHealthcheck.md) |  |  [optional] |
|**id** | **UUID** | Load Balancer Service ID |  [optional] [readonly] |
|**healthcheckStatus** | [**List&lt;LoadBalancerServerStatus&gt;**](LoadBalancerServerStatus.md) | Healthcheck status per backend server |  [optional] [readonly] |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| TCP | &quot;tcp&quot; |
| UDP | &quot;udp&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CREATING | &quot;creating&quot; |
| DELETING | &quot;deleting&quot; |
| RUNNING | &quot;running&quot; |
| UPDATING | &quot;updating&quot; |
| ERROR | &quot;error&quot; |



## Enum: StrategyEnum

| Name | Value |
|---- | -----|
| ROUND_ROBIN | &quot;round-robin&quot; |
| SOURCE_HASH | &quot;source-hash&quot; |



