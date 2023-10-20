

# AddServiceToLoadBalancerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Load Balancer Service name |  |
|**description** | **String** | Load Balancer Service description |  [optional] |
|**instancePool** | [**InstancePool**](InstancePool.md) |  |  |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Network traffic protocol |  |
|**strategy** | [**StrategyEnum**](#StrategyEnum) | Load balancing strategy |  |
|**port** | **Long** | Port exposed on the Load Balancer&#39;s public IP |  |
|**targetPort** | **Long** | Port on which the network traffic will be forwarded to on the receiving instance |  |
|**healthcheck** | [**LoadBalancerServiceHealthcheck**](LoadBalancerServiceHealthcheck.md) |  |  |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| TCP | &quot;tcp&quot; |
| UDP | &quot;udp&quot; |



## Enum: StrategyEnum

| Name | Value |
|---- | -----|
| ROUND_ROBIN | &quot;round-robin&quot; |
| SOURCE_HASH | &quot;source-hash&quot; |



