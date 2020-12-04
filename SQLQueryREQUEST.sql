USE [mdiola01]
GO

/****** Object:  Table [dbo].[REQUESTS]    Script Date: 04/12/2020 11:20:02 pm ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[REQUESTS]') AND type in (N'U'))
DROP TABLE [dbo].[REQUESTS]
GO

/****** Object:  Table [dbo].[REQUESTS]    Script Date: 04/12/2020 11:20:02 pm ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[REQUESTS](
	[userID] [int] NOT NULL,
	[friendID] [int] NOT NULL,
	[rejected] [int] NOT NULL,
	[ignore] [int] NOT NULL
) ON [PRIMARY]
GO


