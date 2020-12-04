USE [gandre03]
GO

/****** Object:  Table [dbo].[LINKS]    Script Date: 04-Dec-20 7:19:58 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[LINKS]') AND type in (N'U'))
DROP TABLE [dbo].[LINKS]
GO

/****** Object:  Table [dbo].[LINKS]    Script Date: 04-Dec-20 7:19:58 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[LINKS](
	[linkID] [int] NOT NULL,
	[userID] [int] NOT NULL,
	[link] [nvarchar](50) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[caption] [nvarchar](50) NOT NULL,
	[descripton] [nvarchar](50) NOT NULL,
	[message] [nvarchar](50) NULL,
 CONSTRAINT [PK_LINKS] PRIMARY KEY CLUSTERED 
(
	[linkID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


ALTER TABLE [dbo].[LINKS]  WITH CHECK ADD  CONSTRAINT [FK_LINKS_USER] FOREIGN KEY([userID])
REFERENCES [dbo].[USER] ([userID])
GO

ALTER TABLE [dbo].[LINKS] CHECK CONSTRAINT [FK_LINKS_USER]
GO

