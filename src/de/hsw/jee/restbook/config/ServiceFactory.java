package de.hsw.jee.restbook.config;

import de.hsw.jee.restbook.services.GuestbookService;

public class ServiceFactory {
	
	public static final BeanHolder<GuestbookService> guestbookService = BeanHolder.of(GuestbookService::new);

	public static GuestbookService getGuestbookService() {
		return guestbookService.get();
	}
	
}
