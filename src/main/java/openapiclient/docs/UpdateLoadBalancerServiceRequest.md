

# UpdateLoadBalancerServiceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Load Balancer Service name |  [optional] |
|**description** | **String** | Load Balancer Service description |  [optional] |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Network traffic protocol |  [optional] |
|**strategy** | [**StrategyEnum**](#StrategyEnum) | Load balancing strategy |  [optional] |
|**port** | **Long** | Port exposed on the Load Balancer&#39;s public IP |  [optional] |
|**targetPort** | **Long** | Port on which the network traffic will be forwarded to on the receiving instance |  [optional] |
|**healthcheck** | [**LoadBalancerServiceHealthcheck**](LoadBalancerServiceHealthcheck.md) |  |  [optional] |



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



