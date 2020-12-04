USE [mdiola01]
GO

/****** Object:  Table [dbo].[EVENTS]    Script Date: 04/12/2020 11:17:45 pm ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[EVENTS]') AND type in (N'U'))
DROP TABLE [dbo].[EVENTS]
GO

/****** Object:  Table [dbo].[EVENTS]    Script Date: 04/12/2020 11:17:45 pm ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[EVENTS](
	[eventID] [int] NOT NULL,
	[owner] [int] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[description] [nvarchar](50) NOT NULL,
	[start_time] [datetime] NOT NULL,
	[end_time] [datetime] NOT NULL,
	[location] [int] NOT NULL,
	[venue] [int] NOT NULL,
	[privacy] [char](10) NOT NULL,
 CONSTRAINT [PK_EVENTS] PRIMARY KEY CLUSTERED 
(
	[eventID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


