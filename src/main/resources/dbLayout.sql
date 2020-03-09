use football
begin transaction

create table league (
	id int primary key not null identity(1,1),
	[name] varchar(50) not null
)

create nonclustered index IX_leaguename on league(name)

create table team (
	id int primary key not null identity(1,1),
	teamId int not null references league(id),
	[name] varchar(50) not null
)

create nonclustered index IX_teamname on team(name)


commit