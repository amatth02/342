
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
