create index IX_2FC45246 on GB_BookDetail (groupId);
create index IX_D71F3DCA on GB_BookDetail (status);
create unique index IX_C8D8D05A on GB_BookDetail (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C49A0FF1 on GB_BorrowEntry (groupId, status);
create index IX_6BB06ABD on GB_BorrowEntry (status, bookId);
create unique index IX_EEDB7EF5 on GB_BorrowEntry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9294AD47 on GB_Guestbook (groupId);
create unique index IX_EDD4239 on GB_Guestbook (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E84D72FD on GB_GuestbookEntry (groupId, guestbookId);
create unique index IX_4A541631 on GB_GuestbookEntry (uuid_[$COLUMN_LENGTH:75$], groupId);