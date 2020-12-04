CREATE TABLE [dbo].[VIDEO](
	[videoID] [int] NOT NULL,
	[userID] [int] NOT NULL,
	[message] [nvarchar](50) NOT NULL,
	[description] [nvarchar](50) NOT NULL,
	[length] [int] NOT NULL,
	[comments] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_VIDEO] PRIMARY KEY CLUSTERED 
(
	[videoID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
