USE [mdiola01]
GO

ALTER TABLE [dbo].[FAVOURITES] DROP CONSTRAINT [FK_FAVOURITES_USER]
GO

/****** Object:  Table [dbo].[FAVOURITES]    Script Date: 04/12/2020 11:18:06 pm ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[FAVOURITES]') AND type in (N'U'))
DROP TABLE [dbo].[FAVOURITES]
GO

/****** Object:  Table [dbo].[FAVOURITES]    Script Date: 04/12/2020 11:18:06 pm ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[FAVOURITES](
	[userID] [int] NOT NULL,
	[interested_in] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[FAVOURITES]  WITH CHECK ADD  CONSTRAINT [FK_FAVOURITES_USER] FOREIGN KEY([userID])
REFERENCES [dbo].[USER] ([userID])
GO

ALTER TABLE [dbo].[FAVOURITES] CHECK CONSTRAINT [FK_FAVOURITES_USER]
GO


