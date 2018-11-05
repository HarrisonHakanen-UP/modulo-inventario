package up.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;

public class ServiceInstanceRestController {
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/service-instances/{applicationName}")
	public List<InstanceInfo> serviceInstancesByApplicationName(@PathVariable String applicationName) {
		return this.discoveryClient.getInstancesById(applicationName);
	}
}
