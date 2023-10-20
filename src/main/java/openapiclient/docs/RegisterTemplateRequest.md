

# RegisterTemplateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maintainer** | **String** | Template maintainer |  [optional] |
|**description** | **String** | Template description |  [optional] |
|**sshKeyEnabled** | **Boolean** | Enable SSH key-based login |  |
|**name** | **String** | Template name |  |
|**defaultUser** | **String** | Template default user |  [optional] |
|**size** | **Long** | Template size |  [optional] |
|**passwordEnabled** | **Boolean** | Enable password-based login |  |
|**build** | **String** | Template build |  [optional] |
|**checksum** | **String** | Template MD5 checksum |  |
|**bootMode** | [**BootModeEnum**](#BootModeEnum) | Boot mode (default: legacy) |  [optional] |
|**url** | **String** | Template source URL |  |
|**version** | **String** | Template version |  [optional] |



## Enum: BootModeEnum

| Name | Value |
|---- | -----|
| LEGACY | &quot;legacy&quot; |
| UEFI | &quot;uefi&quot; |



